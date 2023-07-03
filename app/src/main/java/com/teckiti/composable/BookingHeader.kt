package com.teckiti.composable

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.teckiti.R

@Composable
fun BookingHeader(){
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 16.dp), horizontalArrangement = Arrangement.SpaceBetween){
        BlurBg(
            modifier= Modifier.padding(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .border(
                        1.dp,
                        color = Color.White,
                        shape = CircleShape
                    )
                    .size(20.dp),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.outline_close_24),
                    contentDescription = "",
                    modifier = Modifier.size(20.dp).padding(4.dp),
                    tint = Color.White
                )
            }
        }
        BlurBg(
            modifier= Modifier.padding(4.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.clock),
                    contentDescription = "date",
                    tint = Color.White,
                    modifier = Modifier.size(16.dp),
                )
                SpacerVertical4()
                Text(
                    text = "2h 23m",
                    fontSize=12.sp,
                    color = Color.White,
                )
            }
        }

    }
}