package com.teckiti.ui.screens.booking.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.teckiti.composable.CustomChip
import com.teckiti.ui.theme.space_16
import com.teckiti.ui.theme.space_4
import com.teckiti.utils.Constants

@Composable
fun Times(
    selectedTime: String,
    onSelectedTime: (String) -> Unit ,
){
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(space_16),
        horizontalArrangement = Arrangement.spacedBy(space_4)) {
        items(Constants.times) { hour ->
            CustomChip(
                text = hour,
                isSelected = selectedTime == hour
            ){
                onSelectedTime(hour)
            }
        }
    }
}