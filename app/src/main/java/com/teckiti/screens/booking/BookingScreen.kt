package com.teckiti.screens.booking

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.teckiti.R
import com.teckiti.composable.BookingFooter
import com.teckiti.composable.CloseButton
import com.teckiti.composable.DatePickerHorizintal
import com.teckiti.composable.SeatState
import com.teckiti.composable.Times
import com.teckiti.ui.theme.degree_0_56f
import com.teckiti.ui.theme.degree_70f
import com.teckiti.ui.theme.primary
import com.teckiti.ui.theme.radius_10
import com.teckiti.ui.theme.space_16
import com.teckiti.ui.theme.space_32
import com.teckiti.ui.theme.space_72

@Composable
fun BookingScreen(navController: NavHostController,
) {
    BookingContent(){
       navController.navigateUp()
    }
}


@Composable
fun BookingContent(
    onGoBack: () -> Unit,
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(color = Color.Black)
    ) {
        Box(
            modifier = Modifier.padding(top = space_32, start = space_16)
        ) {
            CloseButton(onClick = {onGoBack()}){}
        }

        Image(
            modifier = Modifier
                .padding(
                    top = space_72
                )
                .graphicsLayer { rotationX = -degree_70f },
            painter = painterResource(R.drawable.cinema_screen), contentDescription = ""
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = space_72)
                .align(Alignment.Center),
            horizontalArrangement = Arrangement.SpaceAround,
        ) {
            SeatState(
                name = stringResource(R.string.available),
                color = Color.White
            )
            SeatState(
                name = stringResource(R.string.reserved),
                color = Color.Gray
            )
            SeatState(
                name = stringResource(R.string.selected),
                color = primary
            )
        }
        Surface(
            modifier = Modifier
                .clip(RoundedCornerShape(topStartPercent = radius_10, topEndPercent = radius_10))
                .fillMaxWidth()
                .fillMaxHeight(degree_0_56f)
                .align(Alignment.BottomCenter),
            color = Color.White
        ) {
            Column(
                modifier = Modifier.padding(vertical = space_16),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                DatePickerHorizintal()
                Times()
                BookingFooter()
            }
        }
    }

}
@Preview
@Composable
fun BookingScreenPreview() {
    BookingScreen(rememberNavController())
}