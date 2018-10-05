package ii_collections

import ii_collections.data.customers
import ii_collections.data.hyderabad
import ii_collections.data.bangulor
import org.junit.Assert.assertEquals
import org.junit.Test

class N19SumKtTest {
    @Test fun testGetTotalOrderPrice() {
        assertEquals(76498.0, customers[bangulor]!!.getTotalOrderPrice(), 0.001)
       // assertEquals(683.0178571428571, customers[bangulor]!!.getTotalOrderPrice(), 0.001)
    }

    @Test fun testTotalPriceForRepeatedProducts() {
        assertEquals(74996.0, customers[hyderabad]!!.getTotalOrderPrice(), 0.001)
    }
}
