package chapter12

class Pizza(
    val toppings: List<String>,
) {
    companion object {
        fun hawaiian(): Pizza {
            return Pizza(listOf("ham", "pineapple"))
        }

        fun margherita(): Pizza {
            return Pizza(listOf("tomato", "mozzarella"))
        }
    }
}
