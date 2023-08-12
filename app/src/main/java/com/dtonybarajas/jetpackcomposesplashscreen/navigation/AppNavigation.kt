package com.dtonybarajas.jetpackcomposesplashscreen.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dtonybarajas.jetpackcomposesplashscreen.MainScreen
import com.dtonybarajas.jetpackcomposesplashscreen.SplashScreen

@Composable
fun AppNavigation() {
    
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.SplashScreen.route) {
        composable(AppScreens.SplashScreen.route) {
            SplashScreen(navController)
        }
        composable(AppScreens.MainScreen.route) {
            MainScreen()
        }
    }
}
