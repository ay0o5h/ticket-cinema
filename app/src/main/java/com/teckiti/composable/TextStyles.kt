package com.teckiti.composable

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.teckiti.R
import com.teckiti.ui.theme.Gray
import com.teckiti.ui.theme.fontSize_12
import com.teckiti.ui.theme.fontSize_14
import com.teckiti.ui.theme.fontSize_20
import com.teckiti.ui.theme.fontSize_22
import com.teckiti.ui.theme.fontSize_24

object TextStyles {
    @Composable
    fun ExtraTextStyle(): TextStyle {
        return TextStyle(
            fontSize = fontSize_24,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
        )
    }
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
    fun MeduimTextStyle(): TextStyle {
        return TextStyle(
            color = Color.Black,
            fontSize = fontSize_14,
            textAlign = TextAlign.Justify,
        )
    }
    @Composable
    fun SmallTextStyle(): TextStyle {
        return TextStyle(
            fontSize = fontSize_12,
            color = Gray,
        )
    }

    @Composable
    fun TextStyle20(): TextStyle {
        return TextStyle(
            color = Color.Black ,
            fontSize= fontSize_20,
            fontWeight = FontWeight.W500,
        )
    }
}