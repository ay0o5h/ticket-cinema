package com.teckiti.composable

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.teckiti.ui.theme.fontSize_14

object TextStyles {
    @Composable
    fun MeduimTextStyle(): TextStyle {
        return TextStyle(
            color = Color.Black,
            fontSize = fontSize_14,
            textAlign = TextAlign.Justify,
        )
    }
}