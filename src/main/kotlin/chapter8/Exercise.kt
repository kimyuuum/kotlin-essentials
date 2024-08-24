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

    fun processUserInformation2(user: User?): String {
        if (user == null) {
            return "Missing user information"
        }

        val name = requireNotNull(user.name)
        val age = user.age ?: 0
        val email = user.email?.email?.takeIf { it.isNotBlank() } ?: return "Missing email"

        return "User $name is $age years old, email: $email"
    }
}
