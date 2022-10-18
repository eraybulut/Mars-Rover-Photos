package com.eraybulut.marsroverphotos.data.remote

import com.eraybulut.marsroverphotos.model.PhotoResponse
import com.eraybulut.marsroverphotos.utils.Constants.API_KEY
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {


    @GET("api/v1/rovers/curiosity/photos?sol=1000&api_key=${API_KEY}")
    fun getPhoto():Call<PhotoResponse>

}