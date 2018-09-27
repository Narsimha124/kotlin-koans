package i_introduction._6_Data_Classes


import util.TODO
import util.doc6
import java.util.ArrayList

fun todoTask6(): Nothing = TODO(
    """
        Convert 'JavaCode6.Person' class to Kotlin.
        Then add a modifier `data` to the resulting class.
        This annotation means the compiler will generate a bunch of useful methods in this class:
        `equals`/`hashCode`, `toString` and some others.
        The `task6` function should return a list of persons.
    """,
    documentation = doc6(),
    //references = {JavaCode6.Person("Narsimha",26)}
        references = { JavaCode6.Person("Alice", 29) }
)

data class Person(val name:String,val age:Int)

fun getAllInfo(): List<Person> {
    todoTask6()
    return listOf(Person("Alice", 29))//, Person("Bob", 31))
}

 //data class Person(val name: String, val age: Int)
//class Person
//fun getAllInfo(): List<Person> {
    //todoTask6()
    //    var getPersonInfo=Person("narsi",26)
//    getPersonInfo=Person.name
//    getPersonInfo=Person.age
//    var s:String=" ";
//    var getAll: ArrayList<Person>;{s-> listOf<Person>(Person("bjvb",2))}
  //  return listOf(Person("Narsimha",26))




