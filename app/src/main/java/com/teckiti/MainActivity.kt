package com.teckiti

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.teckiti.screens.BuyTicket.BookingScreen
import com.teckiti.screens.booking.DetailsScreen
import com.teckiti.screens.home.HomeScreen
import com.teckiti.ui.theme.TeckitiTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            )

            TeckitiTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
//                    val navController = rememberNavController()
//                    TicketNavGraph(navController = navController, START_DESTINATION)
                    BookingScreen()
                }
            }
        }
    }
}

