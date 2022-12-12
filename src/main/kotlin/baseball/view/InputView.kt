package baseball.view

import baseball.model.InputRule
import camp.nextstep.edu.missionutils.Console

class InputView {
    private val inputRule = InputRule()
    fun userNumbers(): String {
        while (true) {
            val input = Console.readLine()
            kotlin.runCatching { inputRule.checkNumbers(input) } // TODO 유저 숫자 체크하는 함수 작성
                .onSuccess { return input }
                .onFailure { e -> OutputView().printErrorMessage(e.message) }
        }
    }
}