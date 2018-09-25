package i_introduction._3_Default_Arguments

import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class N03DefaultArgumentsKtTest {

    @Test fun isNotNull(){
        assertNotNull(useFoo())
        fun toGet(collection: Collection<String>):String{
            return useFoo().toString()
        }
        assertEquals("[a42b1C42D2]",toGet(useFoo()))
    }

    @Test
    fun testDefaultAndNamedParams() {
        assertEquals("[a42b1C42D2]", useFoo().toString())
    }
}