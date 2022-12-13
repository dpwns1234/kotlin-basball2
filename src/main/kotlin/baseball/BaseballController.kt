package baseball

import baseball.model.ComputerNumberMaker
import baseball.model.NumberComparator
import baseball.utils.Constants.ANSWER_COUNT
import baseball.utils.Constants.ZERO
import baseball.view.InputView
import baseball.view.OutputView

class BaseballController {
    private val inputView = InputView()
    private val outputView = OutputView()
    fun runGame() {
        outputView.runMessage()
        do {
            val computerNumbers = ComputerNumberMaker().makeComputerNumber()
            val comparator = NumberComparator(computerNumbers)
            gameStart(comparator)

            outputView.gameEndedMessage()
        } while (inputView.restart())

    }

    private fun gameStart(comparator: NumberComparator) {
        do {
            outputView.printRequireInput()
            val userNumbers = inputView.userNumbers()
            val result = comparator.compareNumbers(userNumbers)
            printHint(result.first, result.second)
        } while(wrongAnswer(result.first))
    }

    private fun printHint(strikeNum: Int, ballNum: Int) {
        if (ballNum > ZERO) outputView.printBall(ballNum)
        if (strikeNum > ZERO) outputView.printStrike(strikeNum)
        if (ballNum == ZERO && strikeNum == ZERO) outputView.printNothing()
        println()
    }

    private fun wrongAnswer(strikeNum: Int): Boolean {
        return strikeNum != ANSWER_COUNT
    }

}