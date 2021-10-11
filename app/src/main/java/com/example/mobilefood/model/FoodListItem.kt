package com.example.mobilefood.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class FoodListItem(
    val description: String,
    val from: String,
    val id: Int,
    val image: String,
    val nutrients: String,
    val organic: Boolean,
    val price: String,
    val productName: String,
    val quantity: String,
    val imageUrl: String
) : Parcelable