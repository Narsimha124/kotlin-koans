package ii_collections

import ii_collections.data.customers
import ii_collections.data.hyderabad
import ii_collections.data.bangulor
import org.junit.Assert.assertEquals
import org.junit.Test

class N19SumKtTest {
    @Test fun testGetTotalOrderPrice() {
        assertEquals(148.0, customers[bangulor]!!.getTotalOrderPrice(), 0.001)
    }

    @Test fun testTotalPriceForRepeatedProducts() {
        assertEquals(586.0, customers[hyderabad]!!.getTotalOrderPrice(), 0.001)
    }
}
