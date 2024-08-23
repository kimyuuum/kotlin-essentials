package chapter6

class Exercise {
    fun formatPersonDisplay(
        name: String?,
        surName: String?,
        age: Int?,
    ): String {
        var result = ""

        if (name.isNullOrEmpty() == false) {
            result += name
        }

        if (surName.isNullOrEmpty() == false) {
            if (result.isNotEmpty()) {
                result += " "
            }
            result += surName
        }

        if (age != null) {
            if (result.isNotEmpty()) {
                result += " "
            }
            result += "($age)"
        }

        return result
    }
}
