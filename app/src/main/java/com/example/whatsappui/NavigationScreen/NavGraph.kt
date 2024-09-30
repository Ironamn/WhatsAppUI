package com.example.whatsappui.NavigationScreen

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.whatsappui.Calls.CallingScreen
import com.example.whatsappui.Calls.items
import com.example.whatsappui.Chat.ChatScreen
import com.example.whatsappui.Status.StatusScreen2

@Composable
fun ScreenNavigation(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = BottomNavRoute.Home.route) {
        composable(route = BottomNavRoute.Home.route) {
            ChatScreen()
        }
        composable(route = BottomNavRoute.STATUS.route) {
            StatusScreen2()
        }
        composable(route = BottomNavRoute.CALL.route) {
            CallingScreen(itemLists = items)
        }
    }

}