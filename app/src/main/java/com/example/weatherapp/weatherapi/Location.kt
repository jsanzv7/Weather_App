package com.example.weatherapp.weatherapi

import com.google.gson.annotations.SerializedName

data class Location(
//    val country: String,
//    val lat: Double,
//    val localtime: String,
//    val localtime_epoch: Int,
//    val lon: Double,
//    val name: String,
//    val region: String,
//    val tz_id: String,

    @SerializedName("name") var name: String,
    @SerializedName("region") var region: String,
    @SerializedName("country") var country: String,
    @SerializedName("lat") var lat: Double,
    @SerializedName("lon") var lon: Double,
    @SerializedName("tz_id") var tzId: String,
    @SerializedName("localtime_epoch") var localtimeEpoch: Int,
    @SerializedName("localtime") var localtime: String,
)