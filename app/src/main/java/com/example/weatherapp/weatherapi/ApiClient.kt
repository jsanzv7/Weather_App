package com.example.weatherapp.weatherapi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiClient {

    private var retrofit: Retrofit? = null

    //API from David --> https://api.weatherapi.com/v1/current.json?key=9745357b64764a1c926173930223105&q=Nhava Sheva&aqi=no

    val BASE_URL = "https://api.weatherapi.com/v1/current.json"

    fun getApiInterface(): ApiService? {
        if (retrofit == null) {
            /* Creating an instance of Retrofit. */
            retrofit = Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build()
        }
        return retrofit!!.create(ApiService::class.java)
    }
}