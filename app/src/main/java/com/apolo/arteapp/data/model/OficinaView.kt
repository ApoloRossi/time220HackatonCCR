package com.apolo.arteapp.data.model

data class OficinaView(val title: String,
                       val ongName: String,
                       val description: String,
                       val eventLink: String,
                       val artType: String,
                       val pictures: List<String>)