package ii_collections

import ii_collections.data.customers
import ii_collections.data.mumbai
import ii_collections.data.shop
import org.junit.Assert.assertEquals
import org.junit.Test

class N21PartitionKtTest {
    @Test fun testGetCustomersWhoHaveMoreUndeliveredOrdersThanDelivered() {
        assertEquals(setOf(customers[mumbai]), shop.getCustomersWithMoreUndeliveredOrdersThanDelivered())
    }
}
