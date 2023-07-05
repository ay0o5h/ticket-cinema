package com.teckiti.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.teckiti.R
import com.teckiti.ui.theme.primary
import com.teckiti.ui.theme.space_20
import com.teckiti.ui.theme.space_48

@Composable
fun PlayButton() {
    IconButton(
        onClick = {},
        modifier = Modifier.size(space_48)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(CircleShape)
                .background(primary),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.play),
                tint= Color.White,
                contentDescription = "",
                modifier = Modifier.size(space_20)
            )
        }
    }
}