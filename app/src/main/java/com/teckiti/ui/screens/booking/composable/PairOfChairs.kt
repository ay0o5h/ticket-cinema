package com.teckiti.ui.screens.booking.composable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.teckiti.R
import com.teckiti.ui.theme.space_20
import androidx.compose.material.IconButton
import androidx.compose.ui.Alignment
import com.teckiti.ui.theme.space_16
import com.teckiti.ui.theme.space_4


@Composable
fun PairOfChairs(
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier.padding(bottom = space_16),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(id = R.drawable.chair_border),
            contentDescription = "",
            modifier = Modifier.width(60.dp),
            tint = White,
        )
        Row(
            modifier = Modifier.padding(bottom = space_4),
            horizontalArrangement = Arrangement.Center,
        ) {
            Chair() {}
            Chair() {}
        }
    }

}

@Composable
fun Chair(
    modifier: Modifier = Modifier,
    ocClickChair: () -> Unit,
) {
        IconButton(
            modifier = modifier.size(space_20),
            onClick = { ocClickChair() },
        ) {
            Icon(
                painter = painterResource(id = R.drawable.seat),
                contentDescription = null,
                tint = White,
            )
        }
}

@Preview
@Composable
fun PairOfChairsPreview() {
    PairOfChairs()
}