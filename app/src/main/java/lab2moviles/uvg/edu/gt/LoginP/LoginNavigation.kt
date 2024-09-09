package lab2moviles.uvg.edu.gt.LoginP

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

fun NavGraphBuilder.loginNavigation(navController: NavController) {
    composable("login") {
        LoginScreen(navController = navController)
    }
}

