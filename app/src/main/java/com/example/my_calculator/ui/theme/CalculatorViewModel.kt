package com.example.my_calculator.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalculatorViewModel:ViewModel() {
    var state by mutableStateOf(CalculatorState())
        private set
}