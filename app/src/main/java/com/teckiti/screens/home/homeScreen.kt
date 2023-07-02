package com.teckiti.screens.home
import android.widget.ImageButton
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ChipBorder
import androidx.compose.material3.ChipElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.teckiti.R
import com.teckiti.composable.CustomChip
import com.teckiti.composable.CustomText
import com.teckiti.composable.OutlineButton
import com.teckiti.composable.PrimaryButton
import com.teckiti.composable.SpacerVertical24
import com.teckiti.ui.theme.Gray
import com.teckiti.ui.theme.LightWhite
import com.teckiti.ui.theme.TextWhite
import com.teckiti.ui.theme.primary

@Composable
fun HomeScreen(
//    navController: NavHostController,
){
    HomeContent()
}

@Composable
private fun HomeContent() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row() {
            PrimaryButton(
                title = "Now Showing",
                modifier = Modifier
                    .padding(end = 4.dp),
            ){}
            OutlineButton(
                title = "Coming Soon",
                modifier= Modifier
                    .padding(start = 4.dp),
            ){}

        }
        SpacerVertical24()
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Icon(
                modifier= Modifier.size(16.dp),
                painter = painterResource(R.drawable.clock_gray),
                contentDescription = "clock",
            )
            Text(text = "2h 33m", color = Color.Black ,fontSize=16.sp,)
        }
        SpacerVertical24()
        CustomText(title = "Fantastic Beasts: The ")
        CustomText(title = "Secrets of Dumbledore")
        SpacerVertical24()
        Row() {
            CustomChip(text = "Fantasy",modifier = Modifier.padding(4.dp),){}
            CustomChip(text = "Adventure",modifier = Modifier.padding(4.dp),){}
        }
    }
}



