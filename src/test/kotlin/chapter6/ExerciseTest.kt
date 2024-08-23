package chapter6

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExerciseTest {
    @Test
    fun testAllParametersEmpty() {
        val name = null
        val surName = null
        val age = null

        val result = Exercise().formatPersonDisplay(name, surName, age)

        assertThat(result).isEqualTo("")
    }

    @Test
    fun testAgeIsEmpty() {
        val name = "John"
        val surName = "Doe"
        val age = null

        val result = Exercise().formatPersonDisplay(name, surName, age)

        assertThat(result).isEqualTo("John Doe")
    }

    @Test
    fun testAllParametersFilled() {
        val name = "John"
        val surName = "Doe"
        val age = 30

        val result = Exercise().formatPersonDisplay(name, surName, age)

        assertThat(result).isEqualTo("John Doe (30)")
    }

    @Test
    fun testSurNameIsEmpty() {
        val name = "John"
        val surName = null
        val age = 50

        val result = Exercise().formatPersonDisplay(name, surName, age)
        assertThat(result).isEqualTo("John (50)")
    }

    @Test
    fun testNameIsEmpty() {
        val name = null
        val surName = "Doe"
        val age = 50

        val result = Exercise().formatPersonDisplay(name, surName, age)
        assertThat(result).isEqualTo("Doe (50)")
    }

    @Test
    fun testSurNameAndAgeIsEmpty() {
        val name = "John"
        val surName = null
        val age = null

        val result = Exercise().formatPersonDisplay(name, surName, age)
        assertThat(result).isEqualTo("John")
    }

    @Test
    fun testNameAndSurNameIsEmpty() {
        val name = null
        val surName = null
        val age = 50

        val result = Exercise().formatPersonDisplay(name, surName, age)
        assertThat(result).isEqualTo("(50)")
    }
}
