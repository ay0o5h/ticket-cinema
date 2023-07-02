package com.teckiti.screens.home
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.unit.dp
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
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Top,
    ) {
        Button(
            onClick = {},
            modifier = Modifier
                .padding(end = 4.dp),
            colors = ButtonDefaults.buttonColors(containerColor = primary),
        ) {
            Text(text = "Now Showing", color = TextWhite)
        }
        OutlinedButton(
            onClick = {},
            modifier = Modifier
                .padding(start = 4.dp),
            colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.White, containerColor = Color.Transparent),
            border = BorderStroke(1.dp, TextWhite)
        ) {
            Text(text = "Coming Soon")
        }
    }
}
@Composable
fun SliderExample() {
    var sliderPosition by remember { mutableStateOf(0f) }

    Slider(
        value = sliderPosition,
        onValueChange = { newValue ->
            sliderPosition = newValue
        },
        valueRange = 0f..100f,
        steps = 5,
        colors = SliderDefaults.colors(
            thumbColor = Color.Red,
            activeTrackColor = Color.Green,
            inactiveTrackColor = Color.Gray
        ),
        modifier = Modifier.width(200.dp)
    )


}



