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
    lateinit var subscribeButton : TextView

    lateinit var instagramAddress : TextView
    lateinit var instagramGroup : Group

    lateinit var youtubeAddress : TextView
    lateinit var youtubeGroup : Group



    val oficina : OficinaView by lazy {
        intent.extras?.getSerializable("oficina") as OficinaView
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.oficina_details_activity)

        bindViews()
        setupYoutubeClickListener()
        setupLayoutInfos()
        setupSubscribeButton()
    }

    private fun setupLayoutInfos() {
        title.text = oficina.title



        description.text = oficina.description
        Picasso.get().load(oficina.pictures[0]).into(picture)

        if (oficina.instagram.isNotEmpty()) {
            instagramGroup.visibility = View.VISIBLE
            instagramAddress.text = oficina.instagram

            setupInstagramClickListener()
            ongName.text = getString(R.string.ong_name, oficina.ongName)
        } else {
            ongName.text = getString(R.string.ong_name, oficina.ongName)
        }
    }

    private fun setupSubscribeButton() {
        subscribeButton.setOnClickListener {
            youtubeGroup.visibility = View.VISIBLE
            subscribeButton.text = "CONFIRMADO"
        }
    }

    private fun setupInstagramClickListener() {
        instagramAddress.setOnClickListener {
            val uri = Uri.parse("http://instagram.com/_u/" + oficina.instagram)
            val likeIng = Intent(Intent.ACTION_VIEW, uri)
            likeIng.`package` = "com.instagram.android"
            try {
                startActivity(likeIng)
            } catch (e: ActivityNotFoundException) {

                startActivity(Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://instagram.com/" + oficina.instagram)))
            }
        }
    }

    private fun bindViews() {
        title = findViewById(R.id.title)
        ongName = findViewById(R.id.ong_name)
        description = findViewById(R.id.description)
        picture = findViewById(R.id.picture)
        subscribeButton = findViewById(R.id.accept_button)
        instagramGroup = findViewById(R.id.instagram_info)
        instagramAddress = findViewById(R.id.instagram_address)
        youtubeGroup  = findViewById(R.id.youtube_info)
        youtubeAddress = findViewById(R.id.youtube_address)

    }

    private fun setupYoutubeClickListener() {
        youtubeAddress.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(oficina.eventLink)
            intent.setPackage("com.google.android.youtube")
            try {
                startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW,
                        Uri.parse(oficina.eventLink)))
            }
        }
    }

}