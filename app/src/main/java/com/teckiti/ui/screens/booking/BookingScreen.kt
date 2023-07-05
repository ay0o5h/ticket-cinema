package com.teckiti.ui.screens.booking

import android.annotation.SuppressLint
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.teckiti.composable.BookingFooter
import com.teckiti.composable.CloseButton
import com.teckiti.composable.DatePickerHorizintal
import com.teckiti.composable.PairOfChairs
import com.teckiti.composable.SeatState
import com.teckiti.composable.Times
import com.teckiti.models.Day
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

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {

        item() {
            Box(
                modifier = Modifier.padding(top = space_32, start = space_16)
            ) {
                CloseButton(onClick = { onGoBack() }) {}
            }
        }

        item() {
            Image(
                modifier = Modifier
                    .graphicsLayer { rotationX = -degree_70f },
                painter = painterResource(R.drawable.cinema_screen), contentDescription = ""
            )
        }


        items(5) {
            Row(
                modifier = Modifier
                    .fillMaxWidth().padding(horizontal = space_16, vertical = space_2),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                repeat(3) {
                    PairOfChairs(
                        modifier = Modifier.graphicsLayer {
                            rotationZ = if (it == 0) 8f else if (it == 1) 0f else -8f
                            translationY = if (it == 1) 20f else 0f
                        },
                    )
                }
            }
        }
        item() {

            Row(
                modifier = Modifier
                    .fillMaxWidth().padding(vertical = space_20),
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
        }

        item() {
            Surface(
                modifier = Modifier
                    .clip(
                        RoundedCornerShape(
                            topStartPercent = radius_10,
                            topEndPercent = radius_10
                        )
                    )
                    .fillMaxWidth()
                    .fillMaxHeight(70f) ,
                color = Color.White
            ) {
                Column(
                    modifier = Modifier.padding(vertical = space_16),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    DatePickerHorizintal(
                        onClick = { day: Day -> onSelectDate(day) },
                        selectedDay = selectedDay

                    )
                    Times(
                        selectedTime = selectedTime
                    ){
                            time: String -> onSelectTime(time)
                    }
                    BookingFooter()
                }
            }

        }

    }
}
@Preview
@Composable
fun BookingScreenPreview() {
    BookingScreen(rememberNavController(), BookingViewModel())
}