package lab2moviles.uvg.edu.gt.Componentes

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import lab2moviles.uvg.edu.gt.CharacterDescriptionP.characterDetailsNavigation
import lab2moviles.uvg.edu.gt.CharactersListP.charactersNavigation
import lab2moviles.uvg.edu.gt.LoginP.loginNavigation

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        loginNavigation(navController)
        charactersNavigation(navController)
        characterDetailsNavigation(navController)
    }
}

