package com.example.weatherapp.weatherapi

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("weather")
    fun fetchWeather(
        @Query("KEY") api_key:String,
        @Query("q") q:String,
        @Query("aqi") aqi:String
    ): Call<LocalWeather>
}