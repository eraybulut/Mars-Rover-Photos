package com.eraybulut.marsroverphotos.model

import com.google.gson.annotations.SerializedName

data class Results (

    @SerializedName("id")
    var id:Int,

    @SerializedName("camera")
    var camera: Camera,

    @SerializedName("img_src")
    var img_src:String,

    @SerializedName("earth_date")
    var earth_date:String,

    @SerializedName("rover")
    var rover: Rover

    )
