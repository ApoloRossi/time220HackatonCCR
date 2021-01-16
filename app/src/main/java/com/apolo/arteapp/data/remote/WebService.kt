package com.apolo.arteapp.data.remote

import retrofit2.http.GET

interface WebService {

    @GET
    fun fetchSomething() {

    }
}