package com.benjaminsinzore.calculator.actions

import com.benjaminsinzore.calculator.operation.CalculatorOperation

sealed class CalculatorActions {
    data class Number(val number: Int): CalculatorActions()
    object Clear: CalculatorActions()
    object Delete: CalculatorActions()
    data class Operation(val operation: CalculatorOperation): CalculatorActions()
    object Calculate: CalculatorActions()
    object Decimal: CalculatorActions()

}
