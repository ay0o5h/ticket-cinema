package com.teckiti.models


enum class ChairState {
    Available,
    Taken,
    Selected
}

fun ChairState.onChangeChairState(): ChairState{
    return when(this){
        ChairState.Available -> ChairState.Taken
        ChairState.Taken -> ChairState.Selected
        ChairState.Selected -> ChairState.Available
    }
}