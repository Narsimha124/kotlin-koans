package i_introduction._3_Default_Arguments

import org.junit.Assert.assertEquals
import org.junit.Test

class N03DefaultArgumentsKtTest {

    @Test
    fun testDefaultAndNamedParams() {
        assertEquals("[a42b1C42D2]", useFoo().toString())
    }
//    @Test
//    fun testDefaultAndNamedParamsAddComma() {
//        assertEquals("[a42, b1, C42, D2]", useFoo())
//    }
//    @Test
//    fun testAddSymbolAndNamedParams() {
//        assertEquals("[a42b1C42D2]", useFoo().toString())
//    }
}