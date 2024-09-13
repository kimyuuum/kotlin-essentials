package chapter9

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ProductTest {
    private val product = Product("Laptop", 999.99, 5)

    @Test
    fun testProductCreate() {
        assertEquals(product.name, "Laptop")
        assertEquals(product.quantity, 5)
        assertEquals(product.calculateTotalValue(), 4999.95)
    }

    @Test
    fun testRestock() {
        product.restock(3)

        assertEquals(product.quantity, 8)
        assertEquals(product.calculateTotalValue(), 7999.92)

        product.quantity = -2
        assertEquals(product.quantity, 0)
        assertEquals(product.calculateTotalValue(), 0.0)

        product.quantity = 10
        assertEquals(product.quantity, 10)
        assertEquals(product.calculateTotalValue(), 9999.9)
    }
}
