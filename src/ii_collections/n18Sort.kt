package ii_collections

fun example5() {
    val result = listOf("a", "bbb", "cc").sortedBy { it.length }

    result == listOf("a", "cc", "bbb")
}

fun Shop.getCustomersSortedByNumberOfOrders(): List<Customer> {
    // Return a list of customers, sorted by the ascending number of orders they made
    //todoCollectionTask()
    val results=customers.sortedBy { it.orders.size }
//    var names:String="samsung"
//    var citys:String="puna"
//    val all=customers.filter { it.name.equals(names) && it.city.equals(citys)}
//            .sortedBy { it.orders.size }.take(55).sortedWith(compareBy { it.name })
//    print("reults $results and $all")
    return  results
}
