package chapter7

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ExerciseTest {
    @Test
    fun testSumOfSquares() {
        val exercise = Exercise()
        assertEquals(0, exercise.calculateSumOfSquares(0))
        assertEquals(1, exercise.calculateSumOfSquares(1))
        assertEquals(14, exercise.calculateSumOfSquares(3))
        assertEquals(30, exercise.calculateSumOfSquares(4))
        assertEquals(55, exercise.calculateSumOfSquares(5))
    }

    @Test
    fun testSumOfEven() {
        val exercise = Exercise()
        assertEquals(0, exercise.calculateSumOfEven(0))
        assertEquals(0, exercise.calculateSumOfEven(1))
        assertEquals(2, exercise.calculateSumOfEven(2))
        assertEquals(2, exercise.calculateSumOfEven(3))
        assertEquals(6, exercise.calculateSumOfEven(4))
        assertEquals(6, exercise.calculateSumOfEven(5))
        assertEquals(12, exercise.calculateSumOfEven(6))
        assertEquals(12, exercise.calculateSumOfEven(7))
        assertEquals(20, exercise.calculateSumOfEven(8))
        assertEquals(20, exercise.calculateSumOfEven(9))
        assertEquals(30, exercise.calculateSumOfEven(10))
    }

    @Test
    fun testCountDownByStep() {
        val exercise = Exercise()
        assertEquals("1", exercise.countDownByStep(1, 1, 1))
        assertEquals("5, 3, 1", exercise.countDownByStep(5, 1, 2))
        assertEquals("10, 7, 4, 1", exercise.countDownByStep(10, 1, 3))
        assertEquals("15, 10, 5", exercise.countDownByStep(15, 5, 5))
        assertEquals("20, 17, 14, 11, 8, 5, 2", exercise.countDownByStep(20, 2, 3))
        assertEquals("-1", exercise.countDownByStep(-1, -1, 1))
        assertEquals("-5, -7, -9", exercise.countDownByStep(-5, -9, 2))
    }
}
