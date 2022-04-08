package com.java.recyclerview

import android.content.Context
import android.util.Log
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.java.recyclerview.ui.ImageLoader


//
// Created by Suraj on 07/04/22.
class GlideImageLoader(private val context: Context):ImageLoader {
    override fun loadImage(imageUrl: String, imageView: ImageView) {
        Glide.with(context)
            .load(imageUrl)
            .centerCrop()
            .into(imageView)
    }
}