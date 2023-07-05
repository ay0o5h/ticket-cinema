package com.teckiti.composable

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.teckiti.ui.theme.space_4

@Composable
fun SpacerVertical4(){
    Spacer(modifier = Modifier.width(space_4))
}