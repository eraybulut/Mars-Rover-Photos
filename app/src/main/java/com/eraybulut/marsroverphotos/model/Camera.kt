package com.eraybulut.marsroverphotos.model

import com.google.gson.annotations.SerializedName

data class Camera(

    @SerializedName("name")
    var name:String,

    @SerializedName("full_name")
    var full_name:String,

)