package baseball.view

class OutputView {
    fun printErrorMessage(message: String?) {
        println(message)
    }

    fun runMessage() {
        println(MESSAGE_RUN_GAME)
    }

    fun gameEndedMessage() {
        println(MESSAGE_ENDED_GAME)
    }

    fun printRequireInput() {
        print(MESSAGE_REQUIRE_NUMBER)
    }

    fun printBall(ballNum: Int) {
        print(MESSAGE_BALL_COUNT.format(ballNum))
    }

    fun printStrike(strikeNum: Int) {
        print(MESSAGE_STRIKE_COUNT.format(strikeNum))
    }

    fun printNothing() {
        print(MESSAGE_NOTHING)
    }

    companion object {
        const val MESSAGE_NOTHING = "낫싱"
        const val MESSAGE_STRIKE_COUNT = "%d스트라이크"
        const val MESSAGE_BALL_COUNT = "%d볼"
        const val MESSAGE_REQUIRE_NUMBER = "숫자를 입력해주세요 : "
        const val MESSAGE_ENDED_GAME =
            "3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" +
                    "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."
        const val MESSAGE_RUN_GAME = "숫자 야구 게임을 시작합니다."
    }
}