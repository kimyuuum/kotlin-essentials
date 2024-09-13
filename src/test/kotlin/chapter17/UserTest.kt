package chapter17

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.time.LocalDateTime

class UserTest {
    private lateinit var user: User

    @BeforeEach
    fun setUp() {
        user =
            User(
                username = "alex",
                email = Email("alex@example.com"),
                registerationDate = LocalDateTime.of(1410, 7, 15, 10, 13),
                height = 170.cm,
            )
    }

    @Test
    fun testToJson() {
        val userJson = user.toJson()
        assertEquals(userJson.username, "alex")
        assertEquals(userJson.email, "alex@example.com")
        assertEquals(userJson.registerationDate, "1410-07-15T10:13")
        assertEquals(userJson.heightCm, 170)
    }

    @Test
    fun testUserJsonToUser() {
        val userJson = user.toJson()
        val user2 = userJson.toUser()
        assertEquals(user2.username, "alex")
        assertEquals(user2.email.value, "alex@example.com")
        assertEquals(user2.registerationDate, LocalDateTime.of(1410, 7, 15, 10, 13))
        assertThat(user2.height).isInstanceOf(Centimeters::class.java)
    }
}
