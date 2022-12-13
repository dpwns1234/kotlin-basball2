package baseball.model

import baseball.utils.Constants.ERROR_NO_THREE_DIGIT
import baseball.utils.Constants.ERROR_OUT_OF_FORMAT
import baseball.utils.Constants.ERROR_OUT_OF_RANGE
import baseball.utils.Constants.ERROR_REDUPLICATED_NUMBER
import baseball.utils.Constants.NUMBER_LENGTH
import baseball.utils.Constants.NUMBER_OF_OUT_OF_RANGE
import baseball.utils.Constants.QUIT
import baseball.utils.Constants.RETRY

class InputRule {
    fun checkNumbers(input: String) {
        if(input.length != NUMBER_LENGTH)
            throw IllegalArgumentException(ERROR_NO_THREE_DIGIT)
        if(input.toSet().size != NUMBER_LENGTH)
            throw IllegalArgumentException(ERROR_REDUPLICATED_NUMBER)
        if(input.contains(NUMBER_OF_OUT_OF_RANGE))
            throw IllegalArgumentException(ERROR_OUT_OF_RANGE)
    }

    fun checkRestart(input: String): Boolean {
        return when (input) {
            RETRY -> true
            QUIT -> false
            else -> throw IllegalArgumentException(ERROR_OUT_OF_FORMAT)
        }

    }
}