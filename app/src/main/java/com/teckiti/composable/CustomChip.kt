package com.teckiti.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Chip
import androidx.compose.material.ChipDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.teckiti.ui.theme.Gray40
import com.teckiti.ui.theme.space_16

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CustomChip(
    text : String ="",
    modifier: Modifier=Modifier,
    onClick: () -> Unit
){
    Chip(
        onClick =onClick,
        shape = RoundedCornerShape(space_16),
        modifier = modifier,

        border = BorderStroke(
            ChipDefaults.OutlinedBorderSize,
            Gray40
        ),
        colors = ChipDefaults.chipColors(
            backgroundColor = Color.Transparent,
            contentColor = Color.Black
        ),
    ){
        Text(text)
    }
}