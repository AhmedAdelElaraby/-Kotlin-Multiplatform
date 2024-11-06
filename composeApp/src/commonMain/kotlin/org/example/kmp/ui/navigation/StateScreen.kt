package com.workdev.taskmoveis.ui.navigation

sealed class StateScreen (val route: String) {
     object StateScreenHome : StateScreen("HomeScreen")
    object StateScreenDetails : StateScreen("ScreenDetails")

}