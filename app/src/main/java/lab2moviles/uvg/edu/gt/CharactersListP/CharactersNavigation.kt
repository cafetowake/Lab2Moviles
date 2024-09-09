package lab2moviles.uvg.edu.gt.CharactersListP

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

fun NavGraphBuilder.charactersNavigation(navController: NavController) {
    composable("characters") {
        CharactersScreen(navController = navController)
    }
}
