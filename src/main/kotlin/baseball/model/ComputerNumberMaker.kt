package baseball.model

import baseball.utils.Constants.NUMBER_LENGTH
import baseball.utils.Constants.RANDOM_LOWER_INCLUSIVE
import baseball.utils.Constants.RANDOM_UPPER_INCLUSIVE
import camp.nextstep.edu.missionutils.Randoms

class ComputerNumberMaker {

    fun makeComputerNumber(): List<Int> {
        val computer = mutableListOf<Int>()
        while (computer.size < NUMBER_LENGTH) {
            val randomNumber = Randoms.pickNumberInRange(RANDOM_LOWER_INCLUSIVE, RANDOM_UPPER_INCLUSIVE)
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber)
            }
        }
        return computer
    }
}