package lab2moviles.uvg.edu.gt.CharacterDescriptionP

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

fun NavGraphBuilder.characterDetailsNavigation(navController: NavController) {
    composable("character_details/{id}") { backStackEntry ->
        val characterId = backStackEntry.arguments?.getString("id")?.toInt() ?: 0
        CharacterDetailsScreen(navController = navController, characterId = characterId)
    }
}
