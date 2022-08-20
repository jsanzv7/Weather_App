package com.example.weatherapp.weatherapi

import com.google.gson.annotations.SerializedName

data class LocalWeather(
//    val current: Current,
//    val location: Location,
//    val condition: Condition
//)

    @SerializedName("location") var location : Location,
    @SerializedName("current") var current  : Current,
    @SerializedName("condition") var condition : Condition,
)