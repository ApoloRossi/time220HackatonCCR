package com.apolo.arteapp.presentation.oficina

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.apolo.arteapp.R

class OficinaDetailsActivity : AppCompatActivity() {

    lateinit var textButton : TextView
    lateinit var eventLink : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.oficina_details_activity)

        textButton = findViewById(R.id.accept_button)
        eventLink = findViewById(R.id.event_link)

        textButton.setOnClickListener {
            eventLink.visibility = View.VISIBLE
            textButton.text = "CONFIRMADO"
        }
    }

}