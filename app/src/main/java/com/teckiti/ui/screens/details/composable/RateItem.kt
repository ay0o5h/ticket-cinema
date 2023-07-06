package com.teckiti.ui.screens.details.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.teckiti.ui.theme.Gray
import com.teckiti.ui.theme.fontSize_12
import com.teckiti.ui.theme.fontSize_14

@Composable
fun RateItem(
    rate: String,
    type: String,
    isPresentageRate : Boolean = false
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        isPresentageRate
        Text(
            text = buildAnnotatedString {
                withStyle(SpanStyle(color = Color.Black)) {
                    append(rate.toString())
                }
                if (!isPresentageRate) {
                    withStyle(SpanStyle(color = Color.Gray)) {
                        append("/10")
                    }
                }
            },
            fontSize = fontSize_14
        )
        Text(
            text = type,
            color = Gray,
            fontSize = fontSize_12
        )
    }
}