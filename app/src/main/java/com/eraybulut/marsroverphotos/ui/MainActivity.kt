package com.eraybulut.marsroverphotos.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.eraybulut.marsroverphotos.R
import com.eraybulut.marsroverphotos.adapter.PhotosAdapter
import com.eraybulut.marsroverphotos.data.remote.ApiClient
import com.eraybulut.marsroverphotos.databinding.ActivityMainBinding
import com.eraybulut.marsroverphotos.model.PhotoResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val apiClient by lazy { ApiClient.getApiClient() }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)


       getMarsInfo()
       binding.rv.setHasFixedSize(true)
       binding.rv.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)





    }

    fun getMarsInfo(){
        apiClient.getPhoto().enqueue(object :Callback<PhotoResponse>{
            override fun onResponse(call: Call<PhotoResponse>, response: Response<PhotoResponse>) {
                if (response.isSuccessful){
                    binding.rv.adapter=PhotosAdapter(this@MainActivity,response.body()!!.photoList)
                }
            }

            override fun onFailure(call: Call<PhotoResponse>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }

}