package com.workdev.taskmoveis.ui.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.workdev.taskmoveis.ui.screens.details.SecondScreen
import com.workdev.taskmoveis.ui.screens.home.HomeScreen

@Composable
fun Navigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = StateScreen.StateScreenHome.route
    ) {
        composable(StateScreen.StateScreenHome.route) {
            HomeScreen(navController = navController)
        }

        composable(
            StateScreen.StateScreenDetails.route + "/{id}",
            arguments = listOf(
                navArgument("id") { type = NavType.IntType }
            )
        ) { backStackEntry ->

            SecondScreen(
                backStackEntry = backStackEntry,
                navController = navController
            )
        }

    }



}






