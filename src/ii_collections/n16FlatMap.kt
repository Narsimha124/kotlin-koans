package ii_collections

fun example() {

    val result = listOf("abc", "12").flatMap { it.toList() }

    result == listOf('a', 'b', 'c', '1', '2')
}

val Customer.orderedProducts: Set<Product> get() {
    // Return all products this customer has ordered
 val getAll=orders.flatMap { it.products }
    print("To get order: $getAll")
    return getAll.toSet()
}

val Shop.allOrderedProducts: Set<Product> get() {
    // Return all products that were ordered by at least one customer
    val getCustomerOrders=customers.flatMap { it.orderedProducts }
    print(getCustomerOrders)
    return getCustomerOrders.toSet()
}
