package i_introduction._11_SAM_Conversions

import org.omg.CORBA.Object
import util.TODO
import util.doc11
import java.util.*

fun todoTask11(): Nothing = TODO(
    """
        Task 11.
        When an object implements a SAM interface (one with a Single Abstract Method), you can pass a lambda instead.
        Rewrite the previous example changing an object expression to a lambda.
    """,
    documentation = doc11()
)

fun task11(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, {x,y->y-x})
val sort= GetSort().getValueDesc(4,6)
   // Collections.sort(arrayList, {x,y->SortValues})
    return arrayList
}
public interface SortValues{
    abstract fun getValueDesc(a:Int,b:Int): Int;
}
class GetSort:SortValues{
    override fun getValueDesc(a: Int, b: Int):Int {
        print(b-a)
        return b-a
    }
}

