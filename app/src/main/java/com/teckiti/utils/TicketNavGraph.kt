package com.teckiti.utils

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.teckiti.models.RoutesNames
import com.teckiti.screens.booking.BookingScreen
import com.teckiti.screens.details.DetailsScreen
import com.teckiti.screens.home.HomeScreen

const val START_DESTINATION = "home"

@Composable
fun TicketNavGraph(
    navController: NavHostController,
) {
    NavHost(navController = navController, startDestination = RoutesNames.HOME) {
        composable(RoutesNames.HOME) {
            HomeScreen(navController)
        }
        composable(RoutesNames.DETAILS) {
            DetailsScreen(navController)
        }
        composable(RoutesNames.BOOKING) {
            BookingScreen(navController)
        }

    }
}
