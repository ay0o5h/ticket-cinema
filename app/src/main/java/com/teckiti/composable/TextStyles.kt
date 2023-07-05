package com.teckiti.composable

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.teckiti.ui.theme.Gray
import com.teckiti.ui.theme.fontSize_14
import com.teckiti.ui.theme.fontSize_22

object TextStyles {
    @Composable
    fun LargeTextStyle(): TextStyle {
        return TextStyle(
            color = Color.Black,
            fontSize = fontSize_22,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }

    @Composable
    fun MeduimGrayTextStyle(): TextStyle {
        return TextStyle(
            color = Gray,
            fontSize = fontSize_14,
            textAlign = TextAlign.Center,
        )
    }
    @Composable
    fun MeduimTextStyle(): TextStyle {
        return TextStyle(
            color = Color.Black,
            fontSize = fontSize_14,
            textAlign = TextAlign.Justify,
        )
    }
}