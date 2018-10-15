package v_builders.data

data class Product(val description: String, val price: Double, val popularity: Int)

val cactus = Product("cactus", 11.2, 13)
val cake = Product("cake", 3.2, 111)


fun getProducts() = listOf(cactus, cake)