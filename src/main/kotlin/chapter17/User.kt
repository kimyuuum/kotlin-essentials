package chapter17

import java.time.LocalDateTime

data class User(
    val username: String,
    val email: Email,
    val registerationDate: LocalDateTime,
    val height: Centimeters,
)

fun User.toJson(): UserJson {
    return UserJson(
        username = this.username,
        email = this.email.value,
        registerationDate = this.registerationDate.toString(),
        heightCm = this.height.value,
    )
}

data class Email(val value: String)

data class Centimeters(val value: Int)

val Int.cm: Centimeters
    get() = Centimeters(this)

data class UserJson(
    val username: String,
    val email: String,
    val registerationDate: String,
    val heightCm: Int,
)

fun UserJson.toUser(): User {
    return User(
        username = this.username,
        email = Email(this.email),
        registerationDate = LocalDateTime.parse(this.registerationDate),
        height = Centimeters(this.heightCm),
    )
}
