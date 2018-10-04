package ii_collections

import ii_collections.data.*
import org.junit.Assert.*
import org.junit.Test

class N15AllAnyAndOtherPredicatesKtTest {
    @Test fun testCustomerIsFromCity() {
        assertTrue(customers[hyderabad]!!.isFrom(hyd_chi_city))
        assertFalse(customers[hyderabad]!!.isFrom(puna))
    }

    @Test fun testAllCustomersAreFromCity() {
        assertFalse(shop.checkAllCustomersAreFrom(hyd_chi_city))
    }

    @Test fun testAnyCustomerIsFromCity() {
        assertTrue(shop.hasCustomerFrom(hyd_chi_city))
    }

    @Test fun testCountCustomersFromCity() {
        assertEquals(2, shop.countCustomersFrom(hyd_chi_city))
    }

    @Test fun testFirstCustomerFromCity() {
        assertEquals(customers[hyderabad], shop.findFirstCustomerFrom(hyd_chi_city))
        assertEquals(null, shop.findFirstCustomerFrom(City("Chicago")))
    }
}
