package chapter8

class Exercise {
    fun processUserInformation(user: User?): String {
        return when {
            user == null -> "Missing user information"
            user.name == null -> throw IllegalArgumentException()
            user.email == null || user.email.email.isNullOrBlank() -> "Missing email"
            else -> {
                val age = user.age ?: 0
                "User ${user.name} is $age years old, email: ${user.email.email}"
            }
        }
    }
}
