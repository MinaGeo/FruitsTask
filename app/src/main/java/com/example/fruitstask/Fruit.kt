package com.example.fruitstask

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Fruit (
    val fruitName: String,
    val fruitImage: Int,
    val shortDesc: String?
) : Parcelable

