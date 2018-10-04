package i_introduction._1_Java_To_Kotlin_Converter

fun task1(collection: Collection<Int>): String {
    print("collection is: $collection \n")
    val sb = StringBuilder()
    sb.append("{")
    val iterator = collection.iterator()
    print("iterator is: $iterator \n")
    while (iterator.hasNext()) {
        val element = iterator.next()
        print("element is : $element \n")
        sb.append(element)
        if (iterator.hasNext()) {
            sb.append(", ")
        }
    }
    sb.append("}")
    print("elements after append : $sb.toString()");
    return sb.toString()
             }
