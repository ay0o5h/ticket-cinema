package com.teckiti.screens.BuyTicket

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Chip
import androidx.compose.material.ChipDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.teckiti.R
import com.teckiti.composable.BlurBg
import com.teckiti.composable.BuyTicketFooter
import com.teckiti.composable.CustomChip
import com.teckiti.composable.DatePickerHorizintal
import com.teckiti.composable.SeatState
import com.teckiti.composable.Times
import com.teckiti.ui.theme.Gray
import com.teckiti.ui.theme.GrayBrown40
import com.teckiti.ui.theme.degree_0_56f
import com.teckiti.ui.theme.degree_70f
import com.teckiti.ui.theme.degree_90f
import com.teckiti.ui.theme.primary
import com.teckiti.ui.theme.radius_10
import com.teckiti.ui.theme.space_1
import com.teckiti.ui.theme.space_16
import com.teckiti.ui.theme.space_20
import com.teckiti.ui.theme.space_32
import com.teckiti.ui.theme.space_4
import com.teckiti.ui.theme.space_72
import com.teckiti.utils.Constans

@Composable
fun BuyTicketScreen() {
    BuyTicketContent()
}


@Composable
fun BuyTicketContent() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(color = Color.Black)
    ) {
        Box(
            modifier = Modifier.padding(top = space_32, start = space_16)
        ) {
            BlurBg(
                modifier = Modifier.padding(8.dp)
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
                        modifier = Modifier
                            .size(space_20)
                            .padding(space_4)
                            .rotate(degrees = degree_90f),
                        tint = Color.White
                    )
                }
            }
        }

        Image(
            modifier = Modifier
                .padding(
                    top = space_72
                )
                .graphicsLayer { rotationX = -degree_70f },
            painter = painterResource(R.drawable.cinema_screen), contentDescription = ""
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = space_72)
                .align(Alignment.Center),
            horizontalArrangement = Arrangement.SpaceAround,
        ) {
            SeatState(
                name = stringResource(R.string.available),
                color = Color.White
            )
            SeatState(
                name = stringResource(R.string.reserved),
                color = Color.Gray
            )
            SeatState(
                name = stringResource(R.string.selected),
                color = primary
            )
        }
        Surface(
            modifier = Modifier
                .clip(RoundedCornerShape(topStartPercent = radius_10, topEndPercent = radius_10))
                .fillMaxWidth()
                .fillMaxHeight(degree_0_56f)
                .align(Alignment.BottomCenter),
            color = Color.White
        ) {
            Column(
                modifier = Modifier.padding(vertical = space_16),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                DatePickerHorizintal()
                Times()
                BuyTicketFooter()
            }
        }
    }

}
@Preview
@Composable
fun BuyTicketScreenPreview() {
    BuyTicketScreen()
}