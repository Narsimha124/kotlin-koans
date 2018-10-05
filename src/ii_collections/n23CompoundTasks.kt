package ii_collections

import com.google.common.primitives.UnsignedBytes.toInt

fun Shop.getCustomersWhoOrderedProduct(product: Product): Set<Customer> {
    // Return the set of customers who ordered the specified product

    //val specificCustomerOrderProduct= customers.flatMap { it.orders }
    val specificCustomerOrderProduct= customers.filter { it.orders.flatMap { it.products }.contains(product)}
    //print(" specificCustomerOrderProduct $specificCustomerOrderProduct")
    return specificCustomerOrderProduct.toSet()
}

fun Customer.getMostExpensiveDeliveredProduct(): Product? {
    // Return the most expensive product among all delivered products
    // (use the Order.isDelivered flag)
   //
  val allDeliveredProduct= orders.filter { it.isDelivered}.flatMap { it.products }.maxBy { it.price }
    print("allDeliveredProduct $allDeliveredProduct")
   // todoCollectionTask()
    return allDeliveredProduct
}

fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    // Return the number of times the given product was ordered.
    // Note: a customer may order the same product for several times.

    val countProductOrdered = customers.flatMap ({ it.orders.flatMap { it.products } }).count({it==product})
    print("countProductOrdered $countProductOrdered")
   return countProductOrdered
}
