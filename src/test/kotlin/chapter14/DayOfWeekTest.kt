package chapter14

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DayOfWeekTest {
    @Test
    fun testFriday() {
        val friday = DayOfWeek.FRIDAY
        assertEquals(friday.dayName, "Friday")
        assertEquals(friday.isWeekend, false)
    }

    @Test
    fun testSaturday() {
        val saturday = DayOfWeek.FRIDAY.nextDay()
        assertEquals(saturday.dayName, "Saturday")
        assertEquals(saturday.isWeekend, true)
    }

    @Test
    fun testMonday() {
        val monday = DayOfWeek.SUNDAY.nextDay()
        assertEquals(monday.dayName, "Monday")
        assertEquals(monday.isWeekend, false)
    }
}
