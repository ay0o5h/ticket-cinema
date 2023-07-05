package com.teckiti.composable

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.teckiti.ui.theme.fontSize_20

@Composable
fun CustomText(title:String,modifier: Modifier=Modifier){
    Text(text = title,
        color = Color.Black ,
        fontSize= fontSize_20,
        fontWeight = FontWeight.W500,
        modifier=modifier
    )
}