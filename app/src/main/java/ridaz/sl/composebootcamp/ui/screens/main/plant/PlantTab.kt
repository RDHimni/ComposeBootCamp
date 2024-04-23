package ridaz.sl.composebootcamp.ui.screens.main.plant

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import ridaz.sl.composebootcamp.ui.screens.main.MainViewModel
import ridaz.sl.composebootcamp.ui.theme.lightGray02

@Composable
fun PlantTab(
    navController: NavController,
    viewModel: MainViewModel = MainViewModel()
){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
            .background(lightGray02)
    ) {
        Text(text = "PlantTab")
    }
}