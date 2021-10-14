package com.example.mobilefood.utils

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.mobilefood.R

// This is an extension function to load the image of each cities coming from firebase
fun ImageView.load(imageAddress: String, onClick: (() -> Unit)? = null) {
    val imageView = this
    Glide.with(this)
        .load(imageAddress).apply(
            RequestOptions()
                .placeholder(R.drawable.loading_status_animation)
                .error(R.drawable.ic_error_image)
        )
        .into(imageView.apply {
            setOnClickListener {
                onClick?.invoke()
            }

        })
}