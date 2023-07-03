package com.teckiti.screens.home
import ImageSlider
import android.annotation.SuppressLint
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.BottomNavigation
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skydoves.cloudy.Cloudy
import com.teckiti.R
import com.teckiti.composable.BackgroundBlurImage
import com.teckiti.composable.CustomChip
import com.teckiti.composable.CustomText
import com.teckiti.composable.NavigationItem
import com.teckiti.composable.OutlineButton
import com.teckiti.composable.PrimaryButton
import com.teckiti.composable.SpacerVertical16
import com.teckiti.composable.SpacerVertical32
import com.teckiti.ui.theme.primary
import com.teckiti.utils.Constans


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(
//    navController: NavHostController,
){
    Scaffold(
        bottomBar = {
            BottomNavigation(
                backgroundColor = Color.Transparent,
                elevation = 0.dp,
                modifier = Modifier.padding(bottom = 8.dp)
            ) {
                NavigationItem(painter = painterResource(id = R.drawable.movie), isSelected = true)
                NavigationItem(painter = painterResource(id = R.drawable.search))
                NavigationItem(painter = painterResource(id = R.drawable.ticket)) {
                    Text(
                        text = "5",
                        textAlign = TextAlign.Center,
                        fontSize = 12.sp,
                        color = Color.White,
                        modifier = Modifier
                            .size(18.dp)
                            .clip(CircleShape)
                            .background(primary),
                        )
                }
                NavigationItem(painter = painterResource(id = R.drawable.user))
            }
        },

    ){
        HomeContent()
    }



}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun HomeContent() {


    val pagerState = rememberPagerState(
        initialPage = Constans.imageList.size / 2
    )
    Box(
        modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())
    ) {
        BackgroundBlurImage(
            painter = painterResource(id = Constans.imageList[pagerState.currentPage]))
        Column(
            modifier = Modifier
                .matchParentSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            SpacerVertical32()
            Row() {
                PrimaryButton(
                    title = "Now Showing",
                    modifier = Modifier
                        .padding(end = 4.dp),
                ) {}
                OutlineButton(
                    title = "Coming Soon",
                    modifier = Modifier
                        .padding(start = 4.dp),
                ) {}

            }
            SpacerVertical16()
            ImageSlider(imageList = Constans.imageList, pagerState = pagerState)
            SpacerVertical16()
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    Icon(
                        modifier = Modifier.size(16.dp),
                        painter = painterResource(R.drawable.clock_gray),
                        contentDescription = "clock",
                    )
                    Text(text = "2h 33m", color = Color.Black, fontSize = 16.sp,)
                }
            SpacerVertical16()
            CustomText(title = "Fantastic Beasts: The \n Secrets of Dumbledore ")
            SpacerVertical16()
            Row() {
                CustomChip(text = "Fantasy", modifier = Modifier.padding(4.dp),) {}
                CustomChip(text = "Adventure", modifier = Modifier.padding(4.dp),) {}
            }
        }
    }
}
@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}



