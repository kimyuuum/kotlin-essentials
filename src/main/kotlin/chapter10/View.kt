package chapter10

open class View(
    var id: String,
    var isVisible: Boolean,
) {
    fun show() {
        this.isVisible = true
    }

    fun hide() {
        this.isVisible = false
    }
}
