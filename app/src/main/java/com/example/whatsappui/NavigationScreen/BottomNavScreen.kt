package com.example.whatsappui.NavigationScreen

import com.example.whatsappui.R

sealed class BottomNanScreen(
    val title: String,
    val icon: Int,
    val route: String
) {
    object Home : BottomNanScreen(
        title = "home_Screen",
        icon = R.drawable.chat,
        route = BottomNavRoute.Home.route
    )
    object Status : BottomNanScreen(
        title = "home_Screen",
        icon = R.drawable.status,
        route = BottomNavRoute.STATUS.route
    )
    object Call : BottomNanScreen(
        title = "home_Screen",
        icon = R.drawable.phone,
        route = BottomNavRoute.CALL.route
    )
}


enum class BottomNavRoute(
    val route: String
) {
    Home("Home"),
    STATUS("Status"),
    CALL("Call"),

}