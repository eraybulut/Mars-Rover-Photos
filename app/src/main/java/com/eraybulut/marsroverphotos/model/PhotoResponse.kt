package com.eraybulut.marsroverphotos.model

import com.google.gson.annotations.SerializedName

data class PhotoResponse(

    @SerializedName("photos")
    var photoList: List<Results>

)
