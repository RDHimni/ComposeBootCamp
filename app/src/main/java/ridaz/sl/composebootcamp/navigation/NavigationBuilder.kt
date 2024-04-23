package ridaz.sl.composebootcamp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import java.io.File

@Composable
fun NavigationBuilder(getDirectory: File){
    val navigationController = rememberNavController()
    NavHost(navController = navigationController, startDestination = PlantScreen.MainScreen.route){
        composable(route =  PlantScreen.MainScreen.route){

        }
        composable(route = PlantScreen.DetailScreen.route){

        }
    }
}