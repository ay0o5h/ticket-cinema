package com.teckiti.screens.booking

import com.teckiti.models.Day

data class BookingUIState(
    val selectedDay: Day = Day(14, "Thu"),
    val selectedTime: String = "",
    val daysMoviePlay :List<Day> = listOf(
        Day(14, "Thu"),
        Day(15, "Fri"),
        Day(16, "Sat"),
        Day(17, "Sun"),
        Day(18, "Mon"),
        Day(19, "Tue"),
        Day(20, "Tue"),
        Day(21, "Tue"),
        Day(22, "Tue"),
    ),
    val times : List<String> = listOf(
        "10:00",
        "12:30",
        "15:30",
        "18:00",
        "18:30",
        "21:30",
        "22:00",
    )
)
