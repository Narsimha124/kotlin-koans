package iii_conventions

import iii_conventions.test.s
import org.junit.Assert.assertEquals
import org.junit.Test

class N26InRangeKtTest {

    fun doTest(date: MyDate, first: MyDate, last: MyDate, shouldBeInRange: Boolean) {
        println("====================================")
        println("date:$date, 'First: $first, 'Last: $last InRange: $shouldBeInRange")
        val message = "The date ${date.s} should${if (shouldBeInRange) "" else "n't"} be in range: ${first.s}..${last.s}"
        println("===================================")
        println("Message:$message, 'InRange: $shouldBeInRange")
        assertEquals(message, shouldBeInRange, checkInRange(date, first, last))
    }

    /* Month numbering starts with 0 (0-Jan, 1-Feb, ... 11-Dec) */
    @Test fun testInRange() {
        doTest(MyDate(2014, 3, 22), MyDate(2014, 1, 1), MyDate(2015, 1, 1), shouldBeInRange = true)
    }

    @Test fun testBefore() {
        doTest(MyDate(2013, 3, 22), MyDate(2014, 1, 1), MyDate(2015, 1, 1), shouldBeInRange = false)
    }

    @Test fun testAfter() {
        doTest(MyDate(2015, 3, 22), MyDate(2014, 1, 1), MyDate(2015, 1, 1), shouldBeInRange = false)
    }

    @Test fun testEqualsToBegin() {
        doTest(MyDate(2014, 3, 22), MyDate(2014, 3, 22), MyDate(2015, 1, 1), shouldBeInRange = true)
    }

    @Test fun testEqualsToEnd() {
        doTest(MyDate(2015, 1, 1), MyDate(2014, 3, 22), MyDate(2015, 1, 1), shouldBeInRange = true)
    }

    @Test fun testInOneDayRange() {
        doTest(MyDate(2015, 1, 1), MyDate(2015, 1, 1), MyDate(2015, 1, 1), shouldBeInRange = true)
    }

    @Test fun testInvalidRange() {
        doTest(MyDate(2014, 2, 1), MyDate(2015, 1, 1), MyDate(2014, 1, 1), shouldBeInRange = false)
    }

    @Test fun testInvalidRangeEqualsToBegin() {
        doTest(MyDate(2015, 1, 1), MyDate(2015, 1, 1), MyDate(2014, 1, 1), shouldBeInRange = false)
    }

    @Test fun testInvalidRangeEqualsToEnd() {
        doTest(MyDate(2014, 1, 1), MyDate(2014, 12, 12), MyDate(2013, 1, 1), shouldBeInRange = false)
    }
}