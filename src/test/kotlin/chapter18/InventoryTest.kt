package chapter18

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class InventoryTest {
    private lateinit var inventory: Inventory
    private lateinit var p1: Product
    private lateinit var p2: Product
    private lateinit var p3: Product

    @BeforeEach
    fun setUp() {
        inventory = Inventory()
        p1 = Product("P1", "Phone", 599.99, "Electronics")
        p2 = Product("P2", "Laptop", 1199.99, "Electronics")
        p3 = Product("P3", "Shirt", 29.99, "Clothing")
    }

    @Test
    fun addProducts() {
        inventory.addProduct(p1, "TechCompany")
        inventory.addProduct(p2, "TechCompany")
        inventory.addProduct(p3, "ClothingCompany")

        assertEquals(3, inventory.getProductsCount())
        assertEquals(true, inventory.hasProduct(p1))
        assertEquals(true, inventory.hasProducts())
        assertEquals("TechCompany", inventory.getProducer(p1))

        val inventoryDisplay = inventory.produceInventoryDisplay()
        val expectedDisplay =
            """
            Inventory:
            Phone (Electronics) - 599.99
            Produced by: TechCompany
            Laptop (Electronics) - 1199.99
            Produced by: TechCompany
            Shirt (Clothing) - 29.99
            Produced by: ClothingCompany
            """.trimIndent()

        assertEquals(expectedDisplay, inventoryDisplay)

        inventory.removeProduct(p2)

        inventory.addSeller("Seller1")
        inventory.addSeller("Seller2")

        val expectedDisplayWithSellers =
            """
            Inventory:
            Phone (Electronics) - 599.99
            Produced by: TechCompany
            Shirt (Clothing) - 29.99
            Produced by: ClothingCompany
            Sellers: [Seller1, Seller2]
            """.trimIndent()

        assertEquals(expectedDisplayWithSellers, inventory.produceInventoryDisplay())

        inventory.removeSeller("Seller2")

        assertEquals(2, inventory.getProductsCount())
        assertEquals(true, inventory.hasProduct(p1))
        assertEquals(false, inventory.hasProduct(p2))
        assertEquals(true, inventory.hasProducts())
        assertEquals(null, inventory.getProducer(p2))

        val expectedDisplay2 =
            """
            Inventory:
            Phone (Electronics) - 599.99
            Produced by: TechCompany
            Shirt (Clothing) - 29.99
            Produced by: ClothingCompany
            Sellers: [Seller1]
            """.trimIndent()

        assertEquals(expectedDisplay2, inventory.produceInventoryDisplay())
    }
}
