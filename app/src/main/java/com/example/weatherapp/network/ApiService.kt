package com.example.weatherapp.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("weather")
    fun fetchWeather(@Query("q") q:String): Call<WeatherResponse>
}