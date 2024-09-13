package chapter14

enum class DayOfWeek(
    val isWeekend: Boolean,
    val dayName: String,
) {
    MONDAY(false, "Monday"),
    TUESDAY(false, "Tuesday"),
    WEDNESDAY(false, "Wednesday"),
    THURSDAY(false, "Thursday"),
    FRIDAY(false, "Friday"),
    SATURDAY(true, "Saturday"),
    SUNDAY(true, "Sunday"),
    ;

    fun nextDay(): DayOfWeek {
        val ordinal =
            if (this.ordinal == 6) {
                0
            } else {
                this.ordinal + 1
            }

        return DayOfWeek.entries.find { it.ordinal == ordinal }!!
    }
}
