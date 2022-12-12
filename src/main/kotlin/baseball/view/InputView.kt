package baseball.view

import baseball.model.InputRule
import camp.nextstep.edu.missionutils.Console

class InputView {
    private val inputRule = InputRule()
    fun userNumbers(): String {
        while (true) {
            val input = Console.readLine()
            kotlin.runCatching { inputRule.checkNumbers(input) }
                .onSuccess { return input }
                .onFailure { e -> OutputView().printErrorMessage(e.message) }
        }
    }

    fun restart(): Boolean {
        while(true) {
            var isRestart = true
            val input = Console.readLine()
            kotlin.runCatching { isRestart = inputRule.checkRestart(input) }
                .onSuccess { return  isRestart }
                .onFailure { e -> OutputView().printErrorMessage(e.message) }
        }
    }
}