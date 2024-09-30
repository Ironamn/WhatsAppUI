package com.example.whatsappui.NavigationScreen

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.whatsappui.ui.theme.BackgroundColor

@Composable
fun BottomNavBar(
    navController: NavHostController
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination


    BottomNavigation(
        modifier = Modifier,
        backgroundColor = BackgroundColor
    ) {

        BottomNavigationItem(
            selected = currentDestination?.route == BottomNanScreen.Home.route,
            onClick = { navController.navigate(BottomNanScreen.Home.route) },
            icon = {
                Icon(painter = painterResource(id =  BottomNanScreen.Home.icon),
                    contentDescription = BottomNanScreen.Home.title)
            }
        )
        BottomNavigationItem(
            selected = currentDestination?.route == BottomNanScreen.Status.route,
            onClick = { navController.navigate(BottomNanScreen.Status.route) },
            icon = {
                Icon(painter = painterResource(id =  BottomNanScreen.Status.icon),
                    contentDescription = BottomNanScreen.Status.title)
            }
        )
        BottomNavigationItem(
            selected = currentDestination?.route == BottomNanScreen.Call.route,
            onClick = { navController.navigate(BottomNanScreen.Call.route) },
            icon = {
                Icon(painter = painterResource(id =  BottomNanScreen.Call.icon),
                    contentDescription = BottomNanScreen.Call.title)
            }
        )
    }
}


