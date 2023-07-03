package com.teckiti.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.teckiti.ui.theme.primary

@Composable
fun RowScope.NavigationItem(
    painter: Painter,
    modifier: Modifier = Modifier,
    isSelected: Boolean = false,
    onClick : () -> Unit = {},
    otherContent: (@Composable () -> Unit)? = null,
) {
    BottomNavigationItem(
        selected = isSelected,
        onClick = onClick,
        icon = {
            Row(
                modifier = modifier
                    .size(52.dp)
                    .clip(if (isSelected) CircleShape else RoundedCornerShape(0.dp))
                    .background(if (isSelected) primary else Color.Transparent),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
            ) {
                Icon(
                    painter = painter,
                    contentDescription = "",
                    tint = if (isSelected) Color.White else Color.Gray
                )
                otherContent?.let {
                    Spacer(modifier = Modifier.width(4.dp))
                    it()
                }
            }

        },
    )
}