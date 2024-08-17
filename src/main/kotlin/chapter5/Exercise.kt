package chapter5

fun secondsToPrettyTime(seconds: Int): String {
    // 초를 정숫값으로 받아서 시간을 "X h  Y min Z sec 형태의 문자열로 반환하는 함수
    // 값이 0이면 결과값을 만들지 않는다
    // 음수면 Invalid input을 반환한다

    when {
        seconds < 0 -> return "Invalid input"
        seconds == 0 -> return ""
        else -> {
            val hour = seconds / (60 * 60)
            val min = (seconds - (hour * 60 * 60)) / 60
            val sec = seconds - (hour * 60 * 60) - (min * 60)

            var res = ""

            if (hour != 0) {
                res += "$hour h"
            }

            if (min != 0) {
                res += " $min min"
            }

            if (sec != 0) {
                res += " $sec sec"
            }
            return res.trimIndent()
        }
    }
}

fun main() {
    println(secondsToPrettyTime(-1))
    println(secondsToPrettyTime(0))
    println(secondsToPrettyTime(45))
    println(secondsToPrettyTime(60))
    println(secondsToPrettyTime(150))
    println(secondsToPrettyTime(1410))
    println(secondsToPrettyTime(60 * 60))
    println(secondsToPrettyTime(3665))
}
