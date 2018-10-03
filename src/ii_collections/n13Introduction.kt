package ii_collections

import java.util.*
import kotlin.collections.HashSet

/*
 * This part of workshop was inspired by:
 * https://github.com/goldmansachs/gs-collections-kata
 */

/*
 *  There are many operations that help to transform one collection into another, starting with 'to'
 */
fun example0(list: List<Int>) {
   print(" list of set is:  $list.toSet() ");
   print("list of Collections is:  $list.toCollection(HashSet<Int>()")
}

fun Shop.getSetOfCustomers(): Set<Customer> {
    // Return a set containing all the customers of this shop
    println(" customers.toSet():  ${customers.toSet()}")
   // return this.customers.toSet()
    return customers.toSet()

}

