package ii_collections

import ii_collections.data.*
import org.junit.Assert.assertEquals
import org.junit.Test


class N22FoldKtTest {
    @Test fun testGetProductsOrderedByAllCustomers() {
        val testShop = shop("test shop for 'fold'",
                customer(hyderabad, hyd_chi_city,
                        order(idea),
                        order(karbon)
                ),
                customer(mumbai, puna,
                        order(htc),
                        order(idea)
                )
        )
        assertEquals(setOf(idea), testShop.getSetOfProductsOrderedByEachCustomer())
        //assertEquals(setOf(celcon), testShop.getSetOfProductsOrderedByEachCustomer())
    }
}
