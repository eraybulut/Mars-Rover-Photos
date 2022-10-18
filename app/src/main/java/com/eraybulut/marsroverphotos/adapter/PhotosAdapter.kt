package com.eraybulut.marsroverphotos.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.eraybulut.marsroverphotos.R
import com.eraybulut.marsroverphotos.model.Results


class PhotosAdapter(var mContext: Context,var photosList: List<Results>):RecyclerView.Adapter<PhotosAdapter.CardViewHolder>() {


    inner class CardViewHolder(view:View):RecyclerView.ViewHolder(view){

        var imageView_photo:ImageView
        var textView_camera_name:TextView
        var textView_landing_date:TextView
        var textView_launch_date:TextView

        init {
            imageView_photo=view.findViewById(R.id.imageView_photo)
            textView_camera_name=view.findViewById(R.id.textView_camera_name)
            textView_landing_date=view.findViewById(R.id.textView_landing_date)
            textView_launch_date=view.findViewById(R.id.textView_launch_date)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view=LayoutInflater.from(mContext).inflate(R.layout.rv_card_view,parent,false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val photo=photosList[position]


        holder.textView_camera_name.text=photo.camera.full_name

        holder.textView_landing_date.text=photo.rover.landing_date

        holder.textView_launch_date.text=photo.rover.launch_date

        Glide
            .with(mContext)
            .load(photo.img_src)
            .centerCrop()
            .into(holder.imageView_photo)


    }

    override fun getItemCount(): Int {
       return photosList.size
    }

}