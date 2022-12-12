package baseball

import baseball.model.ComputerNumberMaker
import baseball.model.NumberComparator
import baseball.view.InputView

class BaseballController {
    private val inputView = InputView()
    fun runGame() {
        println("숫자 야구 게임을 시작합니다.")
        do {
            // 컴퓨터 숫자 생성
            val computerNumbers = ComputerNumberMaker().makeComputerNumber()
            val comparator = NumberComparator(computerNumbers)
            gameStart(comparator)

            println(
                "3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" +
                        "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."
            )
            // 맞췄으면 재시작/종료 여부 입력 받기
            val isRestart = inputView.restart()
            // 종료하면 return
        } while (isRestart)

    }

    private fun gameStart(comparator: NumberComparator) {
        while (true) {
            print("숫자를 입력해주세요 : ")
            val userNumbers = inputView.userNumbers()
            // 컴퓨터와 사용자 입력값 비교
            val result = comparator.compareNumbers(userNumbers)
            val ballNum = result.second
            val strikeNum = result.first
            // 그에 따른 힌트 출력 (TODO enum 사용?)
            // 형식 - 1. 볼이 먼저 출력, 볼이 없을 경우 스트라이크 출력, 아무것도 없을 시 낫싱
            if (ballNum > 0) {
                print("${ballNum}볼 ")
            }
            if (strikeNum > 0) {
                print("${strikeNum}스트라이크")
            }
            if (ballNum == 0 && strikeNum == 0)
                print("낫싱")
            println()

            // 맞추지 못했으면 다시 입력 받도록 반복
            if (strikeNum == 3)
                break
        }
    }


}