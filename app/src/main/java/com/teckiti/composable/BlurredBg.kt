package com.teckiti.composable

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.teckiti.R
import com.teckiti.ui.theme.Gray_E

@Composable
fun BlurBg(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
){
    Card(
        elevation = CardDefaults.elevatedCardElevation(0.dp),
        shape =  MaterialTheme.shapes.extraLarge,
        colors = CardDefaults.cardColors(
            containerColor = Gray_E
        ),
    ) {
        Box(
            modifier = modifier
                .wrapContentWidth()
                .wrapContentHeight(), contentAlignment = Alignment.Center
        ) {
            content()
        }
    }

}