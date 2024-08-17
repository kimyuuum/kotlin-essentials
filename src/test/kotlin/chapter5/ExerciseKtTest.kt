package chapter5

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExerciseKtTest {
    @Test
    fun testNegative() {
        val message = "Invalid input"
        val result = secondsToPrettyTime(-100)
        assertThat(message).isEqualTo(result)
    }

    @Test
    fun testNone() {
        val message = ""
        val result = secondsToPrettyTime(0)
        assertThat(message).isEqualTo(result)
    }

    @Test
    fun testHourMinSec() {
        val message = "1 h 1 min 5 sec"
        val result = secondsToPrettyTime(3665)
        assertThat(message).isEqualTo(result)
    }

    @Test
    fun testHour() {
        val message = "1 h"
        val result = secondsToPrettyTime(3600)
        assertThat(message).isEqualTo(result)
    }

    @Test
    fun testWithoutHour() {
        val message = "23 min 30 sec"
        val result = secondsToPrettyTime(1410)
        assertThat(message).isEqualTo(result)
    }

    // Add more tests here
}
