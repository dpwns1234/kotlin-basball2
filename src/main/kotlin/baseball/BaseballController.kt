package baseball

import baseball.model.ComputerNumberMaker
import baseball.model.NumberComparator
import baseball.view.InputView
import camp.nextstep.edu.missionutils.Console.readLine

class BaseballController {
    private val inputView = InputView()
    private val comparator = NumberComparator()
    fun runGame() {
        println("숫자 야구 게임을 시작합니다.")
        do {
            // 컴퓨터 숫자 생성
            val computerNumbers = ComputerNumberMaker().makeComputerNumber()
            val restart = gameStart(computerNumbers)


            // 재시작한다면 컴퓨터 숫자 다시 생성

            // 종료하면 return
        } while (restart)
    }

    private fun gameStart(computerNumbers: List<Int>): Boolean {
        while(true) {
            print("숫자를 입력해주세요 : ")
            val userNumbers = inputView.userNumbers()

            // 컴퓨터와 사용자 입력값 비교
            comparator.compareNumbers(computerNumbers, userNumbers)

            // 그에 따른 힌트 출력

            // 맞추지 못했으면 다시 입력 받도록 반복

            // 맞췄으면 재시작/종료 여부 입력 받기
            // 입력값 체크
        }
    }
}