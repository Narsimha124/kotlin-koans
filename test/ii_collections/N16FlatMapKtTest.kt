package ii_collections

import ii_collections.data.*
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

class N16FlatMapKtTest {
    @Test fun testGetOrderedProductsSet() {
        assertEquals(setOf(idea), customers[mumbai]!!.orderedProducts)
        assertNotEquals(setOf(idea), customers[vijayawada]!!.orderedProducts)
         assertEquals(setOf(samsung), customers[delhi]!!.orderedProducts)

    }

    @Test fun testGetAllOrderedProducts() {
        assertEquals(orderedProducts, shop.allOrderedProducts)

    }
}
