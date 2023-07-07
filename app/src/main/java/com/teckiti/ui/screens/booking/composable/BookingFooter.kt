package com.teckiti.ui.screens.booking.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.teckiti.R
import com.teckiti.composable.IconButton
import com.teckiti.composable.TextStyles
import com.teckiti.ui.theme.Gray
import com.teckiti.ui.theme.fontSize_12
import com.teckiti.ui.theme.fontSize_24
import com.teckiti.ui.theme.space_16
import com.teckiti.ui.theme.space_48

@Composable
fun BookingFooter() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween  ) {
        Column(
            modifier = Modifier.padding(start = space_16,space_16),
            horizontalAlignment = Alignment.Start) {
            Text(
                text = stringResource(R.string._100_00),
                style = MaterialTheme.typography.titleLarge.merge(TextStyles.ExtraTextStyle()),
                )
            Text(
                text = stringResource(R.string._4_tickets),
                style = MaterialTheme.typography.titleSmall.merge(TextStyles.SmallTextStyle()),
            )

        }
        IconButton(
            image = R.drawable.wallet,
            title= stringResource(R.string.buy_tickets),
            modifier = Modifier
                .padding(space_16)
                .height(space_48),
            onClick = {}
        )
    }
}
