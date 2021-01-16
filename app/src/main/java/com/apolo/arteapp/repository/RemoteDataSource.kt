package com.apolo.arteapp.repository.model

import com.apolo.arteapp.data.remote.WebServiceClient

class RemoteDataSource(val webServiceClient: WebServiceClient) {

    fun fetchSomething() {
        webServiceClient.service.fetchSomething()
    }
}