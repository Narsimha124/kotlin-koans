package i_introduction._1_Java_To_Kotlin_Converter

import util.TODO

//fun todoTask1(collection: Collection<Int>): Nothing = TODO(
//
//    """
//        Task 1.
//        Convert the Java method 'task1' of the class 'JavaCode1' into Kotlin.
//        In IntelliJ IDEA or Android Studio, you can copy the Java code,
//        paste it into the Kotlin file and let IDE convert it.
//        Please use automatic conversion for this task only.
//    """,
       // print("Collections is : $collection")
  //  references = {JavaCode1().task1(collection)})

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
//fun task1(collection: Collection<Int>): String {
//    todoTask1(collection)
//   // return collection.joinToString()
//}