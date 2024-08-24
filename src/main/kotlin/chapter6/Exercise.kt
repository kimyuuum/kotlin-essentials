package chapter6

class Exercise {
    fun formatPersonDisplay(
        name: String?,
        surName: String?,
        age: Int?,
    ): String {
        var result = ""

        if (name.isNullOrEmpty() == false) {
            result += "$name "
        }

        if (surName.isNullOrEmpty() == false) {
            result += "$surName "
        }

        if (age != null) {
            result += "($age)"
        }

        return result.trim()
    }
}
