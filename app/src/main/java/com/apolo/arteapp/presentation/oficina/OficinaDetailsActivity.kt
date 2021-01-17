package com.apolo.arteapp.presentation.oficina

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.Group
import com.apolo.arteapp.R
import com.apolo.arteapp.data.model.OficinaView
import com.squareup.picasso.Picasso

class OficinaDetailsActivity : AppCompatActivity() {

    lateinit var title : TextView
    lateinit var ongName : TextView
    lateinit var description : TextView
    lateinit var picture : ImageView
    lateinit var eventLink : TextView
    lateinit var acceptButton : TextView
    lateinit var instagramAddress : TextView
    lateinit var instagramGroup : Group

    val oficina : OficinaView by lazy {
        intent.extras?.getSerializable("oficina") as OficinaView
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.oficina_details_activity)

        title  = findViewById(R.id.title)
        ongName  = findViewById(R.id.ong_name)
        description = findViewById(R.id.description)
        picture  = findViewById(R.id.picture)
        acceptButton = findViewById(R.id.accept_button)
        eventLink = findViewById(R.id.event_link)
        instagramGroup = findViewById(R.id.instagram_info)
        instagramAddress = findViewById(R.id.instagram_address)


        title.text = oficina.title
        ongName.text = getString(R.string.ong_name, oficina.ongName)
        description.text = oficina.description
        eventLink.text = oficina.eventLink

        if (oficina.instagram.isNotEmpty()) {
            instagramGroup.visibility = View.VISIBLE
            instagramAddress.text = oficina.instagram

            instagramAddress.setOnClickListener {
                val uri = Uri.parse("http://instagram.com/_u/" + oficina.instagram)
                val likeIng = Intent(Intent.ACTION_VIEW, uri)
                likeIng.`package` = "com.instagram.android"
                try {
                    startActivity(likeIng)
                } catch (e: ActivityNotFoundException) {

                    startActivity(Intent (Intent.ACTION_VIEW,
                            Uri.parse("http://instagram.com/" + oficina.instagram)))
                }
            }
        }

        Picasso.get().load(oficina.pictures[0]).into(picture)

        acceptButton.setOnClickListener {
            eventLink.visibility = View.VISIBLE
            acceptButton.text = "CONFIRMADO"
        }
    }

}