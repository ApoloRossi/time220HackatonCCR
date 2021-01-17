package com.apolo.arteapp.presentation.oficina

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
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

        title.text = oficina.title
        ongName.text = getString(R.string.ong_name, oficina.ongName)
        description.text = oficina.description
        eventLink.text = oficina.eventLink


        Picasso.get().load(oficina.pictures[0]).into(picture)

        acceptButton.setOnClickListener {
            eventLink.visibility = View.VISIBLE
            acceptButton.text = "CONFIRMADO"
        }
    }

}