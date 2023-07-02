package com.teckiti.composable

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun CustomText(title:String,modifier: Modifier=Modifier){
    Text(text = title,
        color = Color.Black ,
        fontSize=24.sp,
        fontWeight = FontWeight.SemiBold,
        modifier=modifier
    )

}