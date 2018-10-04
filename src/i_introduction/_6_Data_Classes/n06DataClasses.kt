package i_introduction._6_Data_Classes


import util.TODO
import util.doc6
import java.util.ArrayList

data class Person(val name:String,val age:Int)

fun getAllInfo(): List<Person> {

    val getAll=(listOf<Person>(Person("narsi", 26)))
    print(getAll)
    for(i in getAll)
        print("Name ${i.name.equals("Narsi",ignoreCase = true)}, Age: ${i.age}")
    return getAll

}