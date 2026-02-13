package com.careflow.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.careflow.SplashScreen

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "splash" // Start at splash screen
    ) {
        composable("splash") {
            // Pass a lambda for what happens when splash finishes
            SplashScreen {
                // After splash, you could navigate somewhere else
                // For now, we'll just stay on splash or you can navigate to "main"
                // Example:
                // navController.navigate("main") { popUpTo("splash") { inclusive = true } }
            }
        }

        // Add more screens as you build the app, e.g.:
        // composable("main") { MainScreen() }
    }
}
