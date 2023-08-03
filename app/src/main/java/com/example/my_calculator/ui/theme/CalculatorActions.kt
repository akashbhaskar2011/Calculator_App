package com.example.my_calculator.ui.theme

sealed class CalculatorActions {
    data class Number(val number:Int):CalculatorActions()
    object Clear:CalculatorActions()
    object  Delete:CalculatorActions()
    object Decimal:CalculatorActions()
    object Calculate:CalculatorActions()
    data class Operations(val Operation:CalculatorOperation):CalculatorActions()
}
