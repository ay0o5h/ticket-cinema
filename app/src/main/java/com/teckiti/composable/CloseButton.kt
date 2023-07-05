package com.teckiti.composable

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.teckiti.R
import com.teckiti.ui.theme.space_1
import com.teckiti.ui.theme.space_16
import com.teckiti.ui.theme.space_20
import com.teckiti.ui.theme.space_4
import com.teckiti.ui.theme.space_8

@Composable
fun CloseButton(
    onClick: () -> Unit,
    content :  @Composable () -> Unit
){
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = space_16), horizontalArrangement = Arrangement.SpaceBetween){
        BlurBg(
            modifier= Modifier.padding(space_8).clickable { onClick() }
        ) {
            Box(
                modifier = Modifier
                    .border(
                        space_1,
                        color = Color.White,
                        shape = CircleShape
                    )
                    .size(space_20),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.outline_close_24),
                    contentDescription = "",
                    modifier = Modifier.size(space_20).padding(space_4),
                    tint = Color.White
                )
            }
        }

        content()


    }
}