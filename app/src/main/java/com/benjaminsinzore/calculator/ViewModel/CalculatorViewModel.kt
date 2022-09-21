package com.benjaminsinzore.calculator.ViewModel

import android.media.session.PlaybackState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.benjaminsinzore.calculator.actions.CalculatorActions
import com.benjaminsinzore.calculator.operation.CalculatorOperation
import com.benjaminsinzore.calculator.state.CalculatorState

class CalculatorViewModel: ViewModel() {
    var state by mutableStateOf(CalculatorState())
    private set

    fun onAction(action: CalculatorActions){

        when(action){
            is CalculatorActions.Number -> enterNumber(action.number)
            is CalculatorActions.Decimal -> enterDecimal()
            is CalculatorActions.Clear -> state = CalculatorState()
            is CalculatorActions.Operation -> enterOperation(action.operation)
            is CalculatorActions.Calculate -> performCalculation()
            is CalculatorActions.Delete -> performDeletion()
        }
    }

    private fun performDeletion() {
        TODO("Not yet implemented")
    }

    private fun performCalculation() {
        TODO("Not yet implemented")
    }

    private fun enterOperation(operation: CalculatorOperation) {
        TODO("Not yet implemented")

    }

    private fun enterDecimal() {
        TODO("Not yet implemented")
    }

    private fun enterNumber(number: Int) {
        TODO("Not yet implemented")
    }
}