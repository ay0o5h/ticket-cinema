package com.teckiti.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import com.teckiti.R
import com.teckiti.ui.theme.fontSize_12
import com.teckiti.ui.theme.primary
import com.teckiti.ui.theme.space_0
import com.teckiti.ui.theme.space_16
import com.teckiti.ui.theme.space_4
import com.teckiti.ui.theme.space_56
import com.teckiti.ui.theme.space_8

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
                    .size(space_56)
                    .clip(if (isSelected) CircleShape else RoundedCornerShape(space_0))
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
                    Spacer(modifier = Modifier.width(space_4))
                    it()
                }
            }

        },
    )
}

@Composable
fun BottomNav(){
    BottomNavigation(
        backgroundColor = Color.Transparent,
        elevation = space_0,
        modifier = Modifier.padding(bottom = space_8)
    ) {
        NavigationItem(painter = painterResource(id = R.drawable.movie), isSelected = true)
        NavigationItem(painter = painterResource(id = R.drawable.search))
        NavigationItem(painter = painterResource(id = R.drawable.ticket)) {
            Text(
                text = "5",
                textAlign = TextAlign.Center,
                fontSize = fontSize_12,
                color = Color.White,
                modifier = Modifier
                    .size(space_16)
                    .clip(CircleShape)
                    .background(primary),
            )
        }
        NavigationItem(painter = painterResource(id = R.drawable.user))
    }
}