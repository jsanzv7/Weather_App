package com.example.weatherapp.weatherapi

import com.google.gson.annotations.SerializedName

data class Condition(
//    val code: Int,
//    val icon: String,
//    val text: String,

    @SerializedName("text") var text: String,
    @SerializedName("icon") var icon: String,
    @SerializedName("code") var code: Int,
)