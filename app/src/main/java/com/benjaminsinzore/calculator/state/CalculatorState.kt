package com.benjaminsinzore.calculator.state

import com.benjaminsinzore.calculator.operation.CalculatorOperation

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null
)
