package chapter9

class Product(
    var name: String,
    var price: Double,
    quantity: Int,
) {
    var quantity: Int = quantity
        set(value) {
            field = if (value >= 0) value else 0
        }

    fun calculateTotalValue(): Double {
        return price * quantity
    }

    fun restock(value: Int) {
        if (value > 0) {
            this.quantity += value
        }
    }
}
