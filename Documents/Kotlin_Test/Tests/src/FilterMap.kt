package ii_collections.data

import javax.xml.soap.Name


fun example1(list: List<Int>) {
        print("example fun call $list")
    for(i in list)
        println("pass list of objects : $i")
    // If a lambda has exactly one parameter, that parameter can be accessed as 'it'
    val positiveNumbers = list.filter { it > 0 }
println("positiveNumbers: $positiveNumbers ")
    val squares = list.map { it * it }
    println("squares: $squares ")
}

fun Shop.getCitiesCustomersAreFrom(): Set<City> {
    println("=================")
    // Return the set of cities the customers are from
    val getCustomerCity =customers.map { it.city }.toSet()
    val getSetCustomerName =customers.map { it.name }.toSet()
    val getSetCustomerOrder =customers.map { it.orders }.toSet()

    println("Customer City: $getCustomerCity")
    println("Customer Name: $getSetCustomerName")
    println("Customer Order: $getSetCustomerOrder")

    return getCustomerCity
}
fun Shop.getCustomersFrom(city: City): List<Customer> {
    println("=======++++++++++=========")
    // Return a list of the customers who live in the given city
    val getFilterCustomerCity = customers.filter { it.city == city }
    val getFilterCustomerName =customers.filter { it.name.equals(name)}
    //val getSetCustomerOrder =customers.filter { it.orders == orders}

    println("Customer City: $getFilterCustomerCity")
    println("Customer Name: $getFilterCustomerName")
   // println("Customer Order: $getSetCustomerOrder")

    return getFilterCustomerCity
}
fun Shop.checkAllCustomersAreFrom(city: City): Boolean {
    // Return true if all customers are from the given city

     print("=============$customers.all { it.city==city}")
    return customers.all { it.city==city}
}
val Customer.orderedProducts: Set<Product> get() {
    // val getAllOrderItems= listOf<Product>("mumbai",1300.0).
    // Return all products this customer has ordered
    val getAll=orders.flatMap { it.products }
    print(" $$$$$$$$$$$ $getAll")
    // todoCollectionTask()
    return getAll.toSet()

}