package com.teckiti.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.teckiti.R
import com.teckiti.ui.theme.Gray

@Composable
fun BuyTicketFooter() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween  ) {
        Column(
            modifier = Modifier.padding(start = 16.dp,top=16.dp),
            horizontalAlignment = Alignment.Start) {
            Text(
                text = "$100.00",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
            )
            Text(
                text = "4 tickets",
                fontSize = 10.sp,
                color = Gray,
            )

        }
        IconButton(
            image = R.drawable.wallet,
            title="Buy Tickets",
            modifier = Modifier
                .padding(16.dp)
                .height(48.dp)

        ){}
    }
}
