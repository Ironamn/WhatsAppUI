package com.example.whatsappui.Status


import com.example.whatsappui.R

data class StatusData(
    val name: String,
    val image:Int
)

data class ProfilePhoto(
    val name:String,
    val image:Int
)

val statusData = listOf(
    StatusData("Queen", R.drawable.froozen),
    StatusData("Shizuka", R.drawable.nobita),
    StatusData("YinYang", R.drawable.fish),
    StatusData("Mickey", R.drawable.mickey),
    StatusData("Shukun", R.drawable.sunset),
    StatusData("Dog", R.drawable.yourbesri),
    StatusData("Rabbit", R.drawable.zootopia),
    StatusData("Tom and Jerry", R.drawable.jerry),
    StatusData("Shizuka", R.drawable.nobita),
    StatusData("Mickey", R.drawable.mickey),
    StatusData("YinYang", R.drawable.fish),
    StatusData("Shizuka", R.drawable.nobita),
    StatusData("Rabbit", R.drawable.zootopia),
    StatusData("Mickey", R.drawable.mickey),
    StatusData("Tom and Jerry", R.drawable.jerry),
    StatusData("Sukun", R.drawable.sunset),
    StatusData("Dog", R.drawable.yourbesri),
    StatusData("YinYang", R.drawable.fish),
    StatusData("Mickey", R.drawable.mickey),
    StatusData("Shizuka", R.drawable.nobita),
)
val profilePhoto = listOf(
    ProfilePhoto("My status",R.drawable.yinyang)
)
