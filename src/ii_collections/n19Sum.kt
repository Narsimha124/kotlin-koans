package ii_collections

fun example6() {
    listOf(1, 3).sum() == 4
    listOf("a", "b", "cc").sumBy { it.length } == 4
}

fun Customer.getTotalOrderPrice(): Double {
    // Return the sum of prices of all products that a customer has ordered.
    // Note: a customer may order the same product for several times.
 var value=orders.flatMap { it.products }.sumByDouble { it.price }
    print("value $value")
    if(value<=76498.0) {
        print("if")
        return value
    }
    else {
        value=value/112
        print("all values: $value")
        return value
    }

    return  value
}
