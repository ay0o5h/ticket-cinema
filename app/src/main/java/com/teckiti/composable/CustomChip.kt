package com.teckiti.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Chip
import androidx.compose.material.ChipColors
import androidx.compose.material.ChipDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.teckiti.ui.theme.GrayBrown40
import com.teckiti.ui.theme.LightWhite
import com.teckiti.ui.theme.primary

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CustomChip(
    text : String ="",
    modifier: Modifier=Modifier,
    onClick: () -> Unit
){
    Chip(
        onClick =onClick,
        shape = RoundedCornerShape(16.dp),
        modifier = modifier,

        border = BorderStroke(
            ChipDefaults.OutlinedBorderSize,
            GrayBrown40
        ),
        colors = ChipDefaults.chipColors(
            backgroundColor = Color.Transparent,
            contentColor = Color.Black
        ),
    ){
        Text(text)
    }
}