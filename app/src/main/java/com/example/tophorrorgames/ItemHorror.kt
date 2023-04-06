package com.example.tophorrorgames

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ItemHorror(
    val image: String,
    val name: String,
    val released:String,
    val rating:String,
    val platform:String,
    val developer:String,
    val descript:String
): Parcelable
