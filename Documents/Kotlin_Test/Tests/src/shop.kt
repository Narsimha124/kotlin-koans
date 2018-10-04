package ii_collections.data

data class Shop(val name: String, val customers: List<Customer>)

data class Customer(val name: String, val city: City, val orders: List<Order>) {
    override fun toString() = "Customer Name is:= $name and City is:=  ${city.name}"
}

data class Order(val products: List<Product>, val isDelivered: Boolean)

data class Product(val name: String, val price: Double) {
    override fun toString() = "Product Name is:= '$name' and Price is:= $price"
}

data class City(val name: String) {
    override fun toString() = "Only city Name is: $name"
}


