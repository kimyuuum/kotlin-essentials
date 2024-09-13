package chapter18

class Product(
    val id: String,
    val name: String,
    val price: Double,
    val category: String,
)

class Inventory {
    private val products = mutableListOf<Product>()
    private val productIdToProducer = mutableMapOf<String, String>()
    private val sellers = mutableSetOf<String>()

    fun addProduct(
        product: Product,
        producer: String,
    ) {
        products.add(product)
        productIdToProducer[product.id] = producer
    }

    fun removeProduct(product: Product) {
        products.remove(product)
        productIdToProducer.remove(product.id)
    }

    fun getProductsCount(): Int {
        return products.size
    }

    fun hasProduct(product: Product): Boolean {
        return productIdToProducer.contains(product.id)
    }

    fun hasProducts(): Boolean {
        return products.isNotEmpty()
    }

    fun getProducer(product: Product): String? {
        return productIdToProducer[product.id]
    }

    fun addSeller(seller: String) {
        sellers.add(seller)
    }

    fun removeSeller(seller: String) {
        sellers.remove(seller)
    }

    fun produceInventoryDisplay(): String {
        val builder = StringBuilder()
        builder.append("Inventory:")
        for (product in products) {
            builder.append("\n${product.name} (${product.category}) - ${product.price}")
            builder.append("\nProduced by: ${productIdToProducer[product.id]}")
        }

        if (sellers.isNotEmpty()) {
            builder.append("\nSellers: $sellers")
        }

        return builder.toString()
    }
}
