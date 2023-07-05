package com.teckiti.composable

import androidx.compose.animation.Crossfade
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.teckiti.R
import com.teckiti.models.ChairState
import com.teckiti.ui.theme.Gray
import com.teckiti.ui.theme.primary
import com.teckiti.ui.theme.space_20

@Composable
fun PairOfChairs(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(id = R.drawable.chair_border),
            modifier = Modifier,
            contentDescription = "",
            tint = Gray
        )
        Row(
            horizontalArrangement =  Arrangement.Center,
        ) {
            ChairItem(chairState = ChairState.Available,) {}
            ChairItem(chairState = ChairState.Available,) {}
        }
    }
}
@Preview
@Composable
fun PairOfChairsPreview() {
    PairOfChairs()
}
@Composable
fun ChairItem(
    chairState: ChairState,
    modifier: Modifier = Modifier,
    ocClickChair: (ChairState) -> Unit,
) {
    val tintColor = when (chairState) {
        ChairState.Available -> Color.White
        ChairState.Taken -> Gray
        ChairState.Selected -> primary
    }

    val animatedTintColor by animateColorAsState(
        targetValue = tintColor,
    )

    Crossfade(
        targetState = chairState,
    ) { state ->
        androidx.compose.material.IconButton(
            onClick = { ocClickChair(state) },
        ) {
            Icon(
                painter = painterResource(id = R.drawable.seat),
                contentDescription = null,
                tint = animatedTintColor,
                modifier = modifier.size(space_20).padding(0.dp),
            )
        }
    }
}