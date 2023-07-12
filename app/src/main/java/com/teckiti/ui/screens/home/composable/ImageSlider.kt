import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.teckiti.ui.theme.space_32
import com.teckiti.ui.theme.space_8

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ImageSlider(
    imageList: List<Int>,
    pagerState: PagerState,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    HorizontalPager(
        state = pagerState,
        pageCount = imageList.size,
        contentPadding = PaddingValues(horizontal = space_32),
        pageSpacing = space_8,
        modifier = modifier
    ) {
        val animatedScale by animateFloatAsState(
            targetValue = if (it == pagerState.currentPage) 1f else 0.8f,
            animationSpec = tween(durationMillis = 400)
        )

        Image(
            painter = painterResource(id = imageList[it % imageList.size]),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .aspectRatio(3 / 4f)
                .scale(scaleY = animatedScale, scaleX = 1f)
                .clip(MaterialTheme.shapes.extraLarge)
                .clickable { onClick() }
        )
    }

}
