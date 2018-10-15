package v_builders.examples

fun todoTask38(): Nothing = TODO(
    """
        Task 38.
        The previous examples can be rewritten with the library function 'apply' (see examples below).
        Write your own implementation of the function 'apply' named 'myApply'.
    """
)

//fun <T> T.myApply(f: T.() -> Unit): T {
//    return receiver.f()
//}
//
//fun buildString(): String {
//    return StringBuilder().myApply {
//        append("Numbers: ")
//        for (i in 1..10) {
//            append(i)
//        }
//    }.toString()
//}
//
//fun buildMap(): Map<Int, String> {
//    return hashMapOf<Int, String>().myApply {
//        put(0, "0")
//        for (i in 1..10) {
//            put(i, "$i")
//        }
//    }
//}
fun <T, R> myWith(receiver: T, f: T.() -> R): R {
    return receiver.f()
}

fun buildString(): String {
    val stringBuilder = StringBuilder()
    myWith (stringBuilder) {
        append("Numbers: ")
        for (i in 1..10) {
            append(i)
        }
    }
    return stringBuilder.toString()
}

fun buildMap(): Map<Int, String> {
    val map = hashMapOf<Int, String>()
    myWith (map) {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
    return map
}

