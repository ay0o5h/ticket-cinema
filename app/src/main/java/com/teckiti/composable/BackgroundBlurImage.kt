package com.teckiti.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.skydoves.cloudy.Cloudy

@Composable
fun BackgroundBlurImage(
    painter: Painter,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier.fillMaxSize().blur(32.dp)
        .drawWithContent {
            drawContent()
            drawRect(
                brush = Brush.verticalGradient(
                    listOf(
                        Color.Transparent,
                        Color.Transparent,
                        Color.Transparent,
                        Color.White.copy(alpha = 0.1f),
                        Color.White.copy(alpha = 0.2f),
                        Color.White.copy(alpha = 0.3f),
                        Color.White.copy(alpha = 0.4f),
                        Color.White.copy(alpha = 0.5f),
                        Color.White.copy(alpha = 0.6f),
                        Color.White,
                    ),
                ),
                topLeft = Offset(0f, size.height / 6),
            )
        }
) {

            Image(
                painter = painter,
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.4f)
                    .blur(radius = 32.dp)
            )
        }
}