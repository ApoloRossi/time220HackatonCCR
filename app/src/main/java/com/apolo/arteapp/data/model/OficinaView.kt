package com.apolo.arteapp.data.model

import android.os.Parcelable
import java.io.Serializable

data class OficinaView(val title: String,
                       val ongName: String,
                       val description: String,
                       val eventLink: String,
                       val artType: String,
                       val pictures: List<String>,
                       val instagram : String = "",
                       val telefone : String = "") : Serializable