package com.teckiti.composable
import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.teckiti.ui.theme.TextWhite
import com.teckiti.ui.theme.space_1


@Composable
fun OutlineButton(
    title: String = "",
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier ,
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = Color.White,
            containerColor = Color.Transparent),
        border = BorderStroke(space_1, TextWhite)
    ) {
        Text(text = title)
    }
}