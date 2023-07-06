package com.teckiti.ui.screens.booking.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import com.teckiti.ui.theme.Gray
import com.teckiti.ui.theme.fontSize_14
import com.teckiti.ui.theme.space_12
import com.teckiti.ui.theme.space_8

@Composable
fun SeatState(
    name: String,
    color: Color
){
    Row(verticalAlignment = Alignment.CenterVertically) {
        Box(
            modifier = Modifier
                .size(space_12)
                .clip(CircleShape)
                .background(color)
        )
        Spacer(modifier = Modifier.width(space_8))
        Text(
            text = name,
            color = Gray,
            fontSize = fontSize_14
        )
    }
}