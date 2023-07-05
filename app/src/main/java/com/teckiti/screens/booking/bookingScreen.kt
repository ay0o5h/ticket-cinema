package com.teckiti.screens.booking

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.teckiti.R
import com.teckiti.composable.BookingHeader
import com.teckiti.composable.CastImages
import com.teckiti.composable.CustomChip
import com.teckiti.composable.CustomText
import com.teckiti.composable.IconButton
import com.teckiti.composable.PlayButton
import com.teckiti.composable.SpacerVertical128
import com.teckiti.composable.SpacerVertical16
import com.teckiti.composable.SpacerVertical8
import com.teckiti.composable.TextRate
import com.teckiti.composable.TextStyles
import com.teckiti.screens.home.HomeScreen
import com.teckiti.ui.theme.Gray
import com.teckiti.ui.theme.radius_10
import com.teckiti.ui.theme.space_16
import com.teckiti.ui.theme.space_32
import com.teckiti.ui.theme.space_4
import com.teckiti.ui.theme.space_48
import com.teckiti.ui.theme.space_8
import com.teckiti.utils.Constans
import kotlin.math.roundToInt

@Composable
fun BookingScreen() {
    BookingContent()
}

@Composable
private fun BookingContent() {
    Box(modifier = Modifier.fillMaxSize()
        .verticalScroll(rememberScrollState()))
    {
        Image(
            painter = painterResource(id = R.drawable.slider_1),
            contentDescription = stringResource(R.string.cover),
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
            .fillMaxSize()
            .padding(top = space_32)){
            BookingHeader()
            SpacerVertical128()
            PlayButton()
        }
        Surface(
            modifier = Modifier
                .clip(RoundedCornerShape(topStartPercent = radius_10, topEndPercent = radius_10))
                .fillMaxWidth()
                .fillMaxHeight(0.56f)
                .align(Alignment.BottomCenter),
            color=Color.White
        ) {
            Column(
                modifier = Modifier.padding(vertical = space_16),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = space_16, vertical = space_8),
                    horizontalArrangement = Arrangement.SpaceAround,
                ) {
                    TextRate(rate = stringResource(R.string._6_8),
                        type = stringResource(R.string.imdb))
                    TextRate(rate = stringResource(R.string._63),
                        type = stringResource(R.string.rotten_tomatoes),isPresentageRate = true)
                    TextRate(rate = stringResource(R.string._4), type = stringResource(R.string.ign))

                }
                CustomText(title = stringResource(R.string.fantastic_beasts_the_secrets_of_dumbledore))
                Row() {
                    CustomChip(text = stringResource(R.string.fantasy),
                        modifier = Modifier.padding(space_4),) {}
                    CustomChip(text = stringResource(R.string.adventure),
                        modifier = Modifier.padding(space_4),) {}
                }
                CastImages()
                Text(
                    text = stringResource(R.string.professor_albus_dumbledore_knows_the_powerful) +
                            stringResource(R.string.dark_wizard_gellert_grindelwald_is_moving_to_seize) +
                            stringResource(R.string.control_of_the_wizarding_world_unable_to_stop_him),
                    style = MaterialTheme.typography.titleMedium.merge(TextStyles.MeduimTextStyle()),
                    modifier = Modifier.padding(horizontal = space_16),
                )
                IconButton(
                    image = R.drawable.wallet,
                    title= stringResource(R.string.booking) ,
                    modifier = Modifier.padding(space_16).height(space_48)
                ){}
            }
        }
    }
}

@Preview
@Composable
fun BookingScreenPreview() {
    BookingScreen()
}
