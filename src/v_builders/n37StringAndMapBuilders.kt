package v_builders

import util.TODO
import v_builders.examples.buildMap
import java.util.*
import javax.swing.UIManager.put

//fun buildStringExample(): String {
//    fun buildString(build: StringBuilder.() -> Unit): String {
//        val stringBuilder = StringBuilder()
//        stringBuilder.build()
//        return stringBuilder.toString()
//    }
//    return buildString {
//        this.append("Numbers: ")
//        for (i in 1..10) {
//            // 'this' can be omitted
//            append(i)
//        }
//    }
//}






//fun <H,T> buildMap(build: MutableMap<H,T>.() -> Unit) : Map<H,T> {
//    var map =  HashMap<H,T>() / HashTable<H,T>()
//    map.build()
//    return map
//}
fun <K, V> buildMap(build: HashMap<K, V>.() -> Unit): Map<K, V> {
    val map = HashMap<K, V>()
    print(" kotlin Before map is called: $map \n" )
    map.build()
    print(" kotlin after map is called: $map \n" )
    return map
}
//fun todoTask37(): Nothing = TODO(
//    """
//        Task 37.
//        Uncomment the commented code and make it compile.
//        Add and implement function 'buildMap' with one parameter (of type extension function) creating a new HashMap,
//        building it and returning it as a result.
//    """
//)

fun task37(): Map<Int, String> {
   // todoTask37()
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
            println("loop until map is clled $i")
        }
    }
}
