package com.eraybulut.marsroverphotos.model

import com.google.gson.annotations.SerializedName

data class Rover(

    @SerializedName("landing_date")
    var landing_date:String,

    @SerializedName("launch_date")
    var launch_date:String
)