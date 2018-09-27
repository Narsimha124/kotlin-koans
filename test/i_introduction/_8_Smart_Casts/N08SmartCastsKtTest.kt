package i_introduction._8_Smart_Casts

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

class N08SmartCastsKtTest {
    @Test fun testNum() {
        assertEquals(18, eval(Num(3*6)))
        assertNotEquals("'eval not NUM should work:", 12, eval(Num(2)))
        assertEquals(2, eval(Num(2)))

    }
    @Test fun testSum() {
        assertEquals("'eval' on Sum should work:", 3, eval(Sum(Num(2), Num(1))))
        assertEquals(0, eval(Sum(Num(-62), Num(62))))
        assertEquals( 5, eval(Sum(Num(12), Num(-7))))

    }

//    @Test fun testRecursion() {
//        assertEquals("'eval' should work recursively:", 6, eval(Sum(Sum(Num(1), Num(2)), Num(3))))
//    }
}