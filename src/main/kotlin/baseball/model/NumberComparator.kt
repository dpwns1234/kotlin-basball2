package baseball.model

class NumberComparator(private val computerNumbers: String) {

    // (algorithm -> ball = contains() - strikeNum)
    fun compareNumbers(userNumbers: String): Pair<Int, Int> {
        val strikeNum = calculateStrikeNum(userNumbers)
        val reduplicatedNum = calculateReduplicatedNum(userNumbers)
        val ballNum = reduplicatedNum - strikeNum

        return Pair(strikeNum, ballNum)
    }

    private fun calculateStrikeNum(userNumbers: String): Int {
        var count = 0
        for(i in userNumbers.indices) {
            if(computerNumbers[i] == userNumbers[i])
                count++
        }
        return count
    }

    private fun calculateReduplicatedNum(userNumbers: String): Int {
        var count = 0
        for(number in userNumbers) {
            if(computerNumbers.contains(number))
                count++
        }
        return count
    }
}