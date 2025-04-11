package com.example.coincapapp.services

import com.example.coincapapp.models.AssetsResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import javax.inject.Inject

class CoinCapApiService @Inject constructor(
    private val client: HttpClient
) {
    suspend fun getAssets(): AssetsResponse {
        val response: HttpResponse = client.get(urlString = "https://rest.coincap.io/v3/assets?apiKey=5f80ed512e6fc877ba0576d55ec6c62b95a4ea7b14d1462a7e65af5a8ca63968")
        return response.body()
    }
}