package ii_collections

import ii_collections.data.*
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

class N14FilterMapKtTest {
    @Test fun testCitiesCustomersAreFrom() {
        assertEquals(setOf(hyd_chi_city, ban_city, puna, noyadia, kolkatha_bangular_city), shop.getCitiesCustomersAreFrom())
    }
    /**
     * Returns the list of the customers who live in the city 'city'
     */
    @Test fun testCustomersFromCity() {
        assertEquals(listOf(customers[hyderabad], customers[chianni]), shop.getCustomersFrom(hyd_chi_city))
        assertEquals(listOf(customers[mumbai]), shop.getCustomersFrom(puna))
        assertNotEquals(listOf(customers[hyderabad]), shop.getCustomersFrom(hyd_chi_city))
//        assertEquals(listOf(customers[hyderabad], customers[chianni]), shop.getCustomersFrom(hyd_chi_city))


    }
}
