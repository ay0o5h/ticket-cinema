package com.teckiti.screens.booking

import android.util.Log
import androidx.lifecycle.ViewModel
import com.teckiti.models.Day
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update


@HiltViewModel
class BookingViewModel : ViewModel() {
    private val _state = MutableStateFlow(BookingUIState()      )
    val state = _state.asStateFlow()

    fun oSelectDay(day: Day) {
        Log.d("AYA", "oSelectDay: $day")
        _state.update {
            it.copy(selectedDay = day, selectedTime = "")
        }
    }
    fun oSelectTime(time: String) {
        _state.update {
            it.copy(selectedTime = time)
        }
    }

}