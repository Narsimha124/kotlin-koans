package ii_collections

import ii_collections.data.customers
import ii_collections.data.mumbai
import ii_collections.data.shop
import ii_collections.data.vijayawada
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

class N21PartitionKtTest {
    @Test fun testGetCustomersWhoHaveMoreUndeliveredOrdersThanDelivered() {
        assertNotEquals(setOf(customers[vijayawada]), shop.getCustomersWithMoreUndeliveredOrdersThanDelivered())
        assertEquals(setOf(customers[mumbai]), shop.getCustomersWithMoreUndeliveredOrdersThanDelivered())

    }
}
