package v_builders.examples

import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.*

class N38TheFunctionApplyKtTest {
    @Test fun testBuildString() {
        val expected = StringBuilder().apply {
            append("Numbers: ")
            for (i in 1..10) {
               println(append(i))
            }
        }.toString()
        println("excepted is value i : $expected")
        val actual = buildString()
        println("actual is value i : $actual")

        assertEquals("String should be built:", expected, actual)
    }

    @Test fun testBuildMap() {
        val expected = HashMap<Int, String>().apply {
            put(0, "0")
            for (i in 1..10) {
                put(i, "$i")
            }
        }
        val actual = buildMap()
        assertEquals("Map should be filled with the right values", expected, actual)
    }
}
