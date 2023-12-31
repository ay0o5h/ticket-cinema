package com.teckiti.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.teckiti.ui.theme.degree_0_1f
import com.teckiti.ui.theme.degree_0_2f
import com.teckiti.ui.theme.degree_0_3f
import com.teckiti.ui.theme.space_32

@Composable
fun GradientOverlay(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Box(modifier = modifier
        .fillMaxSize()
        .blur(space_32)
        .drawWithContent {
            drawContent()
            drawRect(
                brush = Brush.verticalGradient(
                    listOf(
                        Color.Transparent,
                        Color.Transparent,
                        Color.Transparent,
                        Color.White.copy(alpha = degree_0_1f),
                        Color.White.copy(alpha = degree_0_1f),
                        Color.White.copy(alpha = degree_0_2f),
                        Color.White.copy(alpha = degree_0_2f),
                        Color.White.copy(alpha = degree_0_3f),
                        Color.White.copy(alpha = degree_0_3f),
                        Color.White,
                    ),
                ),
            )
        }
) {
        content()
    }
}