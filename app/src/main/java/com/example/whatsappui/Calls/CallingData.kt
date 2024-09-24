package com.example.whatsappui.Calls

import androidx.annotation.DrawableRes
import com.example.whatsappui.R

data class ListItem(
    val name: String,
    @DrawableRes val imageRes: Int
)

val items = listOf(
    ListItem("Queen", R.drawable.froozen),
    ListItem("Shizuka", R.drawable.nobita),
    ListItem("YinYang", R.drawable.fish),
    ListItem("Mickey", R.drawable.mickey),
    ListItem("Sukun", R.drawable.sunset),
    ListItem("Dog", R.drawable.yourbesri),
    ListItem("Rabbit", R.drawable.zootopia),
    ListItem("Tom and Jerry", R.drawable.jerry),
    ListItem("Shizuka", R.drawable.nobita),
    ListItem("Mickey", R.drawable.mickey),
    ListItem("YinYang", R.drawable.fish),
    ListItem("Shizuka", R.drawable.nobita),
    ListItem("Rabbit", R.drawable.zootopia),
    ListItem("Mickey", R.drawable.mickey),
    ListItem("Tom and Jerry", R.drawable.jerry),
    ListItem("Sukun", R.drawable.sunset),
    ListItem("Dog", R.drawable.yourbesri),
    ListItem("YinYang", R.drawable.fish),
    ListItem("Mickey", R.drawable.mickey),
    ListItem("Shizuka", R.drawable.nobita)
)