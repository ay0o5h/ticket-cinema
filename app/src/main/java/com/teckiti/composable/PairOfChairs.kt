package com.teckiti.composable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.teckiti.R
import com.teckiti.ui.theme.space_20

@Composable
fun PairOfChairs(
    modifier: Modifier = Modifier,
) {
        Row(
            modifier = modifier,
            horizontalArrangement =  Arrangement.Center,
        ) {
            ChairItem() {}
            ChairItem() {}
        }

}
@Preview
@Composable
fun PairOfChairsPreview() {
    PairOfChairs()
}
@Composable
fun ChairItem(
    modifier: Modifier = Modifier,
    ocClickChair: () -> Unit,
) {


        androidx.compose.material.IconButton(
            onClick = { ocClickChair() },
        ) {
            Icon(
                painter = painterResource(id = R.drawable.seat),
                contentDescription = null,
                tint = White,
                modifier = modifier.size(space_20).padding(0.dp),
            )
        }

}