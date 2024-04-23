package ridaz.sl.composebootcamp

import android.media.audiofx.DynamicsProcessing.BandBase
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ridaz.sl.composebootcamp.data.entity.Explore
import ridaz.sl.composebootcamp.data.entity.Plant
import ridaz.sl.composebootcamp.data.resource.DataResource.colors
import ridaz.sl.composebootcamp.data.resource.DataResource.exploreBlogs
import ridaz.sl.composebootcamp.data.resource.DataResource.plants
import ridaz.sl.composebootcamp.navigation.NavigationBuilder
import ridaz.sl.composebootcamp.ui.theme.ComposeBootCampTheme
import ridaz.sl.composebootcamp.ui.theme.Montserrat
import ridaz.sl.composebootcamp.ui.theme.eerieBlack
import ridaz.sl.composebootcamp.ui.theme.lightGray02
import java.io.File

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBootCampTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavigationBuilder(getDirectory = getDirectory())
                }
            }
        }
    }

    //Store the capture image
    private fun getDirectory(): File {
        val mediaDir = externalMediaDirs.firstOrNull()?.let {
            File(it, getString(R.string.planty_shop)).apply { mkdirs() }
        }
        return if(mediaDir != null && mediaDir.exists())
            mediaDir else filesDir
    }
}








































@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    ComposeBootCampTheme {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Title(title = "Shop")

            ShopList()

            HomeBanner()

            Title(title = "Explore")

            ExploreList()
        }
    }
}


@Composable
fun Home(){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            //   .verticalScroll(rememberScrollState())
            .background(lightGray02)
    ){
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)

        ) {

            Title(title = "Shop")
            ShopList()

            HomeBanner()

            Title(title = "Explore")
            ExploreList()

        }

    }
}


@Composable
fun HomeBanner() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, bottom = 16.dp)
    ) {
        Box(
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .height(160.dp)
                .clip(RoundedCornerShape(20.dp))
        ) {
            Image(
                painter = painterResource(id = R.drawable.home_banner_bg),
                contentDescription = "Home Banner",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillWidth,
            )

            Column(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .width(200.dp)
                    .padding(16.dp)
            ) {
                Text(
                    text = "Get 50% Discount Today",
                    style = TextStyle(
                        fontSize = 30.sp,
                        fontFamily = Montserrat,
                        color = Color.DarkGray
                    )
                )
            }
        }

        Box(
            modifier = Modifier
                .height(200.dp)
                .align(Alignment.BottomEnd)

        ) {
            Image(
                painter = painterResource(id = R.drawable.pinus_parviflora),
                contentDescription = "Banner Plant",
                modifier = Modifier
                    .width(160.dp)
                    .height(160.dp),
                contentScale = ContentScale.FillBounds
            )
        }
    }
}

@Composable
fun PlantItem(plant: Plant) {

    Column(
        modifier = Modifier
            .width(200.dp)
            .height(270.dp)
    ) {
        Box(
            modifier = Modifier
                .width(200.dp)
        ) {
            Card(
                modifier = Modifier
                    .width(200.dp)
                    .height(210.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = 10.dp
            ) {

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            brush = Brush.verticalGradient(
                                colors = listOf(
                                    lightGray02,
                                    Color.White
                                )
                            )
                        )
                ) {
                    LazyColumn(
                        contentPadding = PaddingValues(16.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        items(4) { index ->
                            Card(
                                modifier = Modifier
                                    .size(22.dp),
                                shape = CircleShape,
                                elevation = 5.dp,
                                backgroundColor = colors()[index]
                            ) {}
                        }
                        item {
                            Card(
                                modifier = Modifier
                                    .size(22.dp),
                                shape = CircleShape,
                                elevation = 5.dp,
                                backgroundColor = colors()[colors().size - 1]
                            ) {
                                Text(
                                    text = "3+",
                                    style = TextStyle(
                                        color = Color.White,
                                        fontSize = 12.sp
                                    ),
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(4.dp),
                                    textAlign = TextAlign.Center
                                )
                            }
                        }

                    }
                    Text(
                        text = plant.price.toString() + "$",
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 22.sp
                        ),
                        modifier = Modifier
                            .align(Alignment.BottomStart)
                            .padding(bottom = 16.dp, start = 16.dp),

                        )



                    Image(
                        painter = painterResource(id = plant.image),
                        contentDescription = "Plant Image",
                        modifier = Modifier
                            .fillMaxSize()
                            .align(alignment = Alignment.CenterEnd)
                            .offset(x = 45.dp, y = 40.dp),
                    )

                    /*             Button(
                                     onClick = { *//*TODO*//* },
                    modifier = Modifier
                        .padding(bottom = 16.dp, end = 16.dp)
                        .size(40.dp)
                        .clip(RoundedCornerShape(15.dp))
                        .align(alignment = Alignment.BottomEnd),
                    colors = androidx.compose.material3.ButtonDefaults.buttonColors(containerColor = Color.Black),
                    contentPadding = PaddingValues(0.dp)

                ) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add button",
                        modifier = Modifier.size(25.dp),
                        tint = Color.White
                    )
                }*/

                    androidx.compose.material.Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .padding(bottom = 16.dp, end = 16.dp)
                            .align(alignment = Alignment.BottomEnd)
                            .size(40.dp)
                            .clip(RoundedCornerShape(15.dp)),
                        colors = ButtonDefaults.buttonColors(backgroundColor = eerieBlack),
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "Add button",
                            modifier = Modifier.size(25.dp),
                            tint = Color.White
                        )
                    }


                }


            }

        }
        Text(
            text = plant.name,
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = Montserrat,
                color = Color.DarkGray
            ),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(start = 8.dp, top = 10.dp, end = 8.dp)
        )
        Text(
            text = plant.category,
            style = TextStyle(
                fontSize = 12.sp,
                fontFamily = Montserrat,
                color = Color.Gray
            ),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(start = 8.dp, top = 10.dp, end = 8.dp)
        )
    }


}

@Composable
fun ExploreItem(explore: Explore) {
    Box(modifier = Modifier.fillMaxWidth()) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            shape = RoundedCornerShape(20.dp),
            elevation = 5.dp,
            backgroundColor = Color.White
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = explore.image),
                    contentDescription = "Explore Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clipToBounds()
                )

                Text(
                    text = explore.title,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = Montserrat,
                        color = Color.DarkGray
                    ),
                    modifier = Modifier
                        .padding(start = 16.dp, end = 16.dp, top = 16.dp)
                )

                Text(
                    text = explore.description,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = Montserrat,
                        color = Color.Gray
                    ),
                    modifier = Modifier
                        .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 16.dp),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis

                )


            }
        }
    }

}

@Composable
fun ShopList() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)

    ) {
        LazyRow(
            contentPadding = PaddingValues(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(plants().size) { plant ->
                PlantItem(plant = plants()[plant])
            }
        }
    }
}

@Composable
fun ExploreList() {
    Box(modifier = Modifier.fillMaxWidth()) {
        LazyColumn {
            items(exploreBlogs().size) { explore ->
                ExploreItem(explore = exploreBlogs()[explore])
            }
        }
    }

}

@Composable
fun Title(title: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        androidx.compose.material.Text(
            text = title,
            style = TextStyle(
                color = Color.Black,
                fontSize = 22.sp,
                fontFamily = Montserrat
            )
        )
        Divider(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .weight(1f)
        )
    }
}