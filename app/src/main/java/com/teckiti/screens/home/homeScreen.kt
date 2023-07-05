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
import androidx.compose.foundation.pager.PagerState
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skydoves.cloudy.Cloudy
import com.teckiti.R
import com.teckiti.composable.BackgroundBlurImage
import com.teckiti.composable.BottomNav
import com.teckiti.composable.CustomChip
import com.teckiti.composable.CustomText
import com.teckiti.composable.NavigationItem
import com.teckiti.composable.OutlineButton
import com.teckiti.composable.PrimaryButton
import com.teckiti.composable.SpacerVertical16
import com.teckiti.composable.SpacerVertical32
import com.teckiti.ui.theme.fontSize_16
import com.teckiti.ui.theme.primary
import com.teckiti.ui.theme.space_16
import com.teckiti.ui.theme.space_4
import com.teckiti.ui.theme.space_8
import com.teckiti.utils.Constans


@OptIn(ExperimentalFoundationApi::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(
//    navController: NavHostController,
){
    val pagerState = rememberPagerState(
        initialPage = Constans.imageList.size / 2
    )
    Scaffold(
        bottomBar = {
            BottomNav()
        },

    ){
        HomeContent(pagerState = pagerState)
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun HomeContent(
    pagerState : PagerState
) {
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
                    title = stringResource(R.string.now_showing),
                    modifier = Modifier
                        .padding(end = space_4),
                ) {}
                OutlineButton(
                    title = stringResource(R.string.coming_soon),
                    modifier = Modifier
                        .padding(start = space_4),
                ) {}
            }
            SpacerVertical16()
            ImageSlider(imageList = Constans.imageList, pagerState = pagerState)
            SpacerVertical16()
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space_8),
                ) {
                    Icon(
                        modifier = Modifier.size(space_16),
                        painter = painterResource(R.drawable.clock_gray),
                        contentDescription = stringResource(R.string.clock),
                    )
                    Text(text = stringResource(R.string._2h_33m), color = Color.Black, fontSize = fontSize_16,)
                }
            SpacerVertical16()
            CustomText(title = stringResource(R.string.fantastic_beasts_the_secrets_of_dumbledore))
            SpacerVertical16()
            Row() {
                CustomChip(text = stringResource(R.string.fantasy), modifier = Modifier.padding(space_4),) {}
                CustomChip(text = stringResource(R.string.adventure), modifier = Modifier.padding(space_4),) {}
            }
        }
    }
}
@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}