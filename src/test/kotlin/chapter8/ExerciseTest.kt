package chapter8

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ExerciseTest {
    @Test
    fun testUserNull() {
        val result = Exercise().processUserInformation(null)
        assertEquals("Missing user information", result)
    }

    @Test
    fun testUserNameNull() {
        assertThrows(IllegalArgumentException::class.java) {
            Exercise().processUserInformation(
                User(
                    null,
                    20,
                    EmailAddress("abc@de.com"),
                ),
            )
        }
    }

    @Test
    @DisplayName("Age가 null일 경우 0으로 표기한다.")
    fun testUserAgeNull() {
        val result =
            Exercise().processUserInformation(
                User(
                    "Alice",
                    null,
                    EmailAddress("abc@de.com"),
                ),
            )

        assertEquals("User Alice is 0 years old, email: abc@de.com", result)
    }

    @Test
    fun testUserEmailIsNullOrBlank() {
        val result =
            Exercise().processUserInformation(
                User(
                    "Alice",
                    20,
                    null,
                ),
            )

        val result2 =
            Exercise().processUserInformation(
                User(
                    "Alice",
                    20,
                    EmailAddress("           "),
                ),
            )

        assertEquals("Missing email", result)
        assertEquals("Missing email", result2)
    }

    @Test
    fun testAllDatasArePresent() {
        val result =
            Exercise().processUserInformation(
                User(
                    "Alice",
                    20,
                    EmailAddress("abc@de.com"),
                ),
            )

        assertEquals("User Alice is 20 years old, email: abc@de.com", result)
    }
}
