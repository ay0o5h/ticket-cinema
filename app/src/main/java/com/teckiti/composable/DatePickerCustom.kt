package com.teckiti.composable

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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.teckiti.ui.theme.Gray
import com.teckiti.ui.theme.GrayBrown40
import com.teckiti.ui.theme.space_16
import com.teckiti.ui.theme.space_4
import com.teckiti.utils.Constans

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun DatePickerCustom(
    dayNumber : Int,
    dayName : String
){

    Chip(
        onClick ={},
        shape = RoundedCornerShape(space_16),


        border = BorderStroke(
            ChipDefaults.OutlinedBorderSize,
            GrayBrown40
        ),
        colors = ChipDefaults.chipColors(
            backgroundColor = Color.Transparent,
            contentColor = Color.Black
        ),

        ) {
        Column(
            Modifier.fillMaxWidth().padding(vertical = space_4),

            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(

                text = dayNumber.toString(),
                color = Color.Black,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Text(
                text = dayName,
                color = Gray,
                fontSize = 14.sp,
                textAlign = TextAlign.Center,


                )
        }
    }
}

@Composable
fun DatePickerHorizintal(){
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(space_16),
        horizontalArrangement = Arrangement.spacedBy(space_4)) {
        items(Constans.daysMoviePlay) { day ->
            DatePickerCustom(
                dayNumber = day.dayNumber,
                dayName = day.dayName
            )

        }
    }
}