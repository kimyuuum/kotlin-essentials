package chapter7

class Exercise {
    fun calculateSumOfSquares(n: Int): Int {
        require(n >= 0) { "n must be a non-negative number" }
        var sum = 0
        for (i in 0..n) {
            sum += i * i
        }

        return sum
    }

    fun calculateSumOfEven(n: Int): Int {
        require(n >= 0) { "n must be a non-negative number" }

        var sum = 0
        for (i in 0..n) {
            if (i % 2 == 0) {
                sum += i
            }
        }

        return sum
    }

    fun countDownByStep(
        start: Int,
        end: Int,
        step: Int,
    ): String {
        var result = ""

        for (i in start downTo end step step) {
            result += "$i, "
        }

        return result.dropLast(2)
    }

    fun countDownByStep2(
        start: Int,
        end: Int,
        step: Int,
    ): String {
        // joinToString의 기본 separator는 ", "이다.
        return (start downTo end step step).joinToString()
    }
}
