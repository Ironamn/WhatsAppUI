package com.example.whatsappui.Chat

import androidx.annotation.DrawableRes
import com.example.whatsappui.R

data class ChatsData(
    val name: String,
    @DrawableRes val image: Int
)

val chatsItems = listOf(
    ChatsData("Queen", R.drawable.froozen),
    ChatsData("Shizuka", R.drawable.nobita),
    ChatsData("YinYang", R.drawable.fish),
    ChatsData("Mickey", R.drawable.mickey),
    ChatsData("Shukun", R.drawable.sunset),
    ChatsData("Dog", R.drawable.yourbesri),
    ChatsData("Rabbit", R.drawable.zootopia),
    ChatsData("Tom and Jerry", R.drawable.jerry),
    ChatsData("Shizuka", R.drawable.nobita),
    ChatsData("Mickey", R.drawable.mickey),
    ChatsData("YinYang", R.drawable.fish),
    ChatsData("Shizuka", R.drawable.nobita),
    ChatsData("Rabbit", R.drawable.zootopia),
    ChatsData("Mickey", R.drawable.mickey),
    ChatsData("Tom and Jerry", R.drawable.jerry),
    ChatsData("Sukun", R.drawable.sunset),
    ChatsData("Dog", R.drawable.yourbesri),
    ChatsData("YinYang", R.drawable.fish),
    ChatsData("Mickey", R.drawable.mickey),
    ChatsData("Shizuka", R.drawable.nobita),
)
