package com.teckiti.screens.booking

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.teckiti.R
import com.teckiti.composable.BookingHeader
import com.teckiti.composable.CastImages
import com.teckiti.composable.CustomChip
import com.teckiti.composable.CustomText
import com.teckiti.composable.IconButton
import com.teckiti.composable.PlayButton
import com.teckiti.composable.SpacerVertical128
import com.teckiti.composable.SpacerVertical16
import com.teckiti.composable.SpacerVertical8
import com.teckiti.composable.TextRate
import com.teckiti.screens.home.HomeScreen
import com.teckiti.ui.theme.Gray
import com.teckiti.utils.Constans
import kotlin.math.roundToInt

@Composable
fun BookingScreen() {
    BookingContent()
}

@Composable
private fun BookingContent() {
    Box(modifier = Modifier.fillMaxSize()
        .verticalScroll(rememberScrollState()))
    {
        Image(
            painter = painterResource(id = R.drawable.slider_1),
            contentDescription = "cover",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
            .fillMaxSize()
            .padding(top = 32.dp)){
            BookingHeader()
            SpacerVertical128()
            PlayButton()
        }
        Surface(
            modifier = Modifier
                .clip(RoundedCornerShape(topStartPercent = 8, topEndPercent = 8))
                .fillMaxWidth()
                .fillMaxHeight(0.56f)
                .align(Alignment.BottomCenter),
            color=Color.White
        ) {
            Column(
                modifier = Modifier.padding(vertical = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    horizontalArrangement = Arrangement.SpaceAround,
                ) {
                    TextRate(rate = "6.8", type = "IMDb")
                    TextRate(rate = "63%", type = "Rotten Tomatoes",isPresentageRate = true)
                    TextRate(rate = "4", type = "IGN")

                }
                CustomText(title = "Fantastic Beasts: The \n Secrets of Dumbledore ")
                Row() {
                    CustomChip(text = "Fantasy", modifier = Modifier.padding(4.dp),) {}
                    CustomChip(text = "Adventure", modifier = Modifier.padding(4.dp),) {}
                }
                CastImages()
                Text(
                    text = "Professor Albus Dumbledore knows the powerful," +
                            "dark wizard Gellert Grindelwald is moving to seize" +
                            "control of the wizarding world. Unable to stop him...",
                    color = Color.Black,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(horizontal = 16.dp),
                    textAlign = TextAlign.Justify,
                )
                IconButton(
                    image = R.drawable.wallet,
                    title="Booking" ,
                    modifier = Modifier.padding(16.dp).height(48.dp)

                ){}
            }
        }
    }
}

@Preview
@Composable
fun BookingScreenPreview() {
    BookingScreen()
}
