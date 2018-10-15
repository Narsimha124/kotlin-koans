package v_builders

import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.*

class N37StringAndMapBuildersKtTest {
    @Test fun testBuildMap() {
        val map = task37()
        print("after map is called: $map" )
        val expected = HashMap<Int, String>()
        println("after HashMap is called: $expected" )
        for (i in 0..10) {
            expected[i] = "$i"
            println(" expected $expected")
        }
        assertEquals("Map should be filled with the right values", expected, map)
    }
}

