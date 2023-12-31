package com.teckiti.composable

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.teckiti.ui.theme.TextWhite
import com.teckiti.ui.theme.fontSize_16
import com.teckiti.ui.theme.primary
import com.teckiti.ui.theme.space_4

@Composable
fun IconButton(
    title: String = "",
    image:Int,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
){
    Button(
        onClick = onClick,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(containerColor = primary),
    ) {
        Icon(painter = painterResource(id = image), contentDescription ="",tint= Color.White )
        Spacer(modifier = Modifier.width(space_4))
        Text(text = title, color = TextWhite, fontSize = fontSize_16)
    }
}