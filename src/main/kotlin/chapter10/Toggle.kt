package chapter10

class Toggle(
    id: String,
) : View(id, true) {
    var isOn: Boolean = false

    fun click() {
        isOn = !isOn
    }
}
