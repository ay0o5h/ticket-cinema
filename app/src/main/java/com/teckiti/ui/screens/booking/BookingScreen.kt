package com.teckiti.ui.screens.booking

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.teckiti.R
import com.teckiti.ui.screens.booking.composable.BookingFooter
import com.teckiti.composable.CloseButton
import com.teckiti.ui.screens.booking.composable.PairOfChairs
import com.teckiti.models.Day
import com.teckiti.ui.screens.booking.composable.CinemaSeats
import com.teckiti.ui.screens.booking.composable.MovieDisplayDays
import com.teckiti.ui.screens.booking.composable.MovieDisplayTimes
import com.teckiti.ui.screens.booking.composable.MoviesSeatReservationStatus
import com.teckiti.ui.theme.degree_70f
import com.teckiti.ui.theme.primary
import com.teckiti.ui.theme.radius_10
import com.teckiti.ui.theme.space_16
import com.teckiti.ui.theme.space_2
import com.teckiti.ui.theme.space_20
import com.teckiti.ui.theme.space_32

@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun BookingScreen(
    navController: NavHostController,
    viewModel: BookingViewModel = hiltViewModel(),
) {
    val state by viewModel.state.collectAsState()
    BookingContent(
        onSelectDate = { day: Day -> viewModel.oSelectDay(day) },
        onSelectTime = { time: String -> viewModel.oSelectTime(time) },
        selectedDay = state.selectedDay,
        selectedTime = state.selectedTime,
        onGoBack = { navController.navigateUp() },
    )
}


@Composable
fun BookingContent(
    onSelectDate: (Day) -> Unit,
    onSelectTime: (String) -> Unit,
    selectedTime: String,
    selectedDay: Day,
    onGoBack: () -> Unit,
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
            .verticalScroll(rememberScrollState())

    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
                .fillMaxSize()
                .padding(top = space_32)
        ) {
            CloseButton(
                onClick = { onGoBack() }) {}
            Image(
                modifier = Modifier
                    .graphicsLayer { rotationX = -degree_70f },
                painter = painterResource(R.drawable.cinema_screen), contentDescription = ""
            )
            CinemaSeats()
            Spacer(modifier =   Modifier.padding(top = space_32))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = space_20),
                horizontalArrangement = Arrangement.SpaceAround,
            ) {
                MoviesSeatReservationStatus(
                    name = stringResource(R.string.available),
                    color = Color.White
                )
                MoviesSeatReservationStatus(
                    name = stringResource(R.string.reserved),
                    color = Color.Gray
                )
                MoviesSeatReservationStatus(
                    name = stringResource(R.string.selected),
                    color = primary
                )
            }

        }

        Surface(
            modifier = Modifier
                .clip(
                    RoundedCornerShape(
                        topStartPercent = radius_10,
                        topEndPercent = radius_10
                    )
                )
                .fillMaxWidth()
                .fillMaxHeight(50f)
                .align(Alignment.BottomCenter),
            color = Color.White,

            ) {
            Column(
                modifier = Modifier.padding(vertical = space_16),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                MovieDisplayDays(
                    onClick = { day: Day -> onSelectDate(day) },
                    selectedDay = selectedDay

                )
                MovieDisplayTimes(
                    selectedTime = selectedTime
                ){
                        time: String -> onSelectTime(time)
                }
                BookingFooter()
            }
        }
    }

}
@Preview
@Composable
fun BookingScreenPreview() {
    BookingScreen(rememberNavController(), BookingViewModel())
}