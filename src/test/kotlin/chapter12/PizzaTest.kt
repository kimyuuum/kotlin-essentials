package chapter12

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PizzaTest {
    @Test
    fun testHawaiian() {
        val hawaiian = Pizza.hawaiian()
        assertThat(hawaiian.toppings)
            .containsAnyElementsOf(listOf("ham", "pineapple"))
    }

    @Test
    fun testMargherita() {
        val margherita = Pizza.margherita()
        assertThat(margherita.toppings)
            .containsAnyElementsOf(listOf("tomato", "mozzarella"))
    }
}
