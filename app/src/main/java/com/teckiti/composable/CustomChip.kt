package com.teckiti.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.teckiti.ui.theme.LightWhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomChip(
    text : String ="",
    modifier: Modifier=Modifier,
    onClick: () -> Unit
){
    AssistChip(
        onClick =onClick,
        shape = RoundedCornerShape(16.dp),
        modifier = modifier,
        colors = AssistChipDefaults.assistChipColors(
            labelColor = Color.Black
        ),
        border =   AssistChipDefaults.assistChipBorder(
            borderColor = LightWhite,
            borderWidth= .5.dp
        ),
        label = { Text(text) },
    )
}