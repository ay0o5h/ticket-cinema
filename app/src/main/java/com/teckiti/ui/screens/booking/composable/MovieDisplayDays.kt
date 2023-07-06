package com.teckiti.ui.screens.booking.composable

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Chip
import androidx.compose.material.ChipDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import com.teckiti.composable.TextStyles
import com.teckiti.models.Day
import com.teckiti.ui.theme.Gray
import com.teckiti.ui.theme.Gray40
import com.teckiti.ui.theme.fontSize_14
import com.teckiti.ui.theme.space_16
import com.teckiti.ui.theme.space_4
import com.teckiti.utils.Constants

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MovieDisplayDaysChip(
    dayNumber : Int,
    dayName : String,
    isSelected: Boolean = false,
    onClick: () -> Unit = {}
){

    Chip(
        onClick ={onClick()},
        shape = RoundedCornerShape(space_16),
        border = BorderStroke(
            ChipDefaults.OutlinedBorderSize,
            Gray40
        ),
        colors = ChipDefaults.chipColors(
            backgroundColor =when (isSelected) {
                true -> Gray
                false -> Color.Transparent
            },
            contentColor = Color.Black
        ),

        ) {
        Column(
            Modifier.fillMaxWidth().padding(vertical = space_4),

            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = dayNumber.toString(),
                style = MaterialTheme.typography.titleLarge.merge(TextStyles.LargeTextStyle()),
            )
            Text(
                text = dayName,
                color =when(isSelected) {
                    true -> Color.White
                    false -> Gray
                },
                fontSize = fontSize_14,
                textAlign = TextAlign.Center,
                )
        }
    }
}

@Composable
fun MovieDisplayDays(
    onClick: (Day) -> Unit ,
    selectedDay: Day
){
    Log.d("AYA", "DatePickerHorizintal:$selectedDay  ")
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(space_16),
        horizontalArrangement = Arrangement.spacedBy(space_4)) {
        items(Constants.daysMoviePlay) { day ->
            MovieDisplayDaysChip(
                dayNumber = day.dayNumber,
                dayName = day.dayName,
                isSelected = day == selectedDay,
                onClick = { onClick(day) }
            )
        }
    }
}