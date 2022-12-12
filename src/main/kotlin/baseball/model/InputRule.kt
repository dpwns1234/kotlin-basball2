package baseball.model

class InputRule {
/*

    - [ ] 서로 다른 3개의 숫자를 입력
    - [ ] [ERROR] 1-9 범위 벗어남, 중복되는 자리수, 3개가 아님
 */
    fun checkNumbers(input: String) {
        if(input.length != 3)
            throw IllegalArgumentException("[ERROR] 3자리 입력하셈")
        if(input.toSet().size != 3)
            throw IllegalArgumentException("[ERROR] 중복되는 숫자가 있습니다.")
        if(input.contains('0'))
            throw IllegalArgumentException("[ERROR] 1-9의 범위를 지켜주세요")
    }

    fun checkRestart(input: String): Boolean {
        return when (input) {
            "1" -> true
            "2" -> false
            else -> throw IllegalArgumentException("[ERROR] 1 또는 2를 입력해주세요.")
        }

    }
}