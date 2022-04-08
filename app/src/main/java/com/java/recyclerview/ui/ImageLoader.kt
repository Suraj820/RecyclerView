package com.java.recyclerview.ui

import android.widget.ImageView


//
// Created by Suraj on 02/04/22.
interface ImageLoader {
    fun loadImage(imageUrl: String, imageView: ImageView)
}