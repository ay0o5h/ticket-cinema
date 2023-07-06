package com.teckiti.ui.screens.booking.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import com.teckiti.ui.theme.space_16

@Composable
fun CinemaSeats(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier.fillMaxSize().padding(horizontal = space_16),
        horizontalArrangement= Arrangement.SpaceBetween,

    ) {

        Column() {
            repeat(5) {
                PairOfChairs(
                    modifier = Modifier.graphicsLayer {
                        rotationZ = 8f
                    }
                )
            }
        }
        Column() {
            repeat(5) {
                PairOfChairs(
                    modifier = Modifier.graphicsLayer {
                        rotationZ = 0f
                        translationY=20f
                    }
                )
            }
        }
        Column() {
            repeat(5) {
                PairOfChairs(
                    modifier = Modifier.graphicsLayer {
                        rotationZ = -8f
                    }
                )
            }
        }

    }
}
