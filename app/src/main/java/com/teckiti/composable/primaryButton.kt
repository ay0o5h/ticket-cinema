package com.teckiti.composable
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.teckiti.ui.theme.TextWhite
import com.teckiti.ui.theme.primary

@Composable
fun PrimaryButton(
    title: String = "",
    modifier: Modifier = Modifier,
    onClick: () -> Unit
){
    Button(
        onClick = onClick,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(containerColor = primary),
    ) {
        Text(text = title, color = TextWhite)
    }
}
