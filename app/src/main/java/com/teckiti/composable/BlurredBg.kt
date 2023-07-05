package com.teckiti.composable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.teckiti.ui.theme.Gray_E
import com.teckiti.ui.theme.space_0

@Composable
fun BlurBg(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
){
    Card(
        elevation = CardDefaults.elevatedCardElevation(space_0),
        shape =  MaterialTheme.shapes.extraLarge,
        colors = CardDefaults.cardColors(
            containerColor = Gray_E
        ),
    ) {
        Box(
            modifier = modifier
                .wrapContentWidth()
                .wrapContentHeight(), contentAlignment = Alignment.Center
        ) {
            content()
        }
    }

}