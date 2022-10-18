package com.eraybulut.marsroverphotos.data.remote

import com.eraybulut.marsroverphotos.utils.Constants.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ApiClient {


    fun getApiClient():ApiService{

        val retrofit=Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()


        return retrofit.create(ApiService::class.java)
    }
}