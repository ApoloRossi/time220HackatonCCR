package com.apolo.arteapp.presentation

interface HomeContract {

    interface View {
        fun showArts(arts : List<String>);
    }

    interface Presenter {
        fun fetchArts() {

        }
    }
}