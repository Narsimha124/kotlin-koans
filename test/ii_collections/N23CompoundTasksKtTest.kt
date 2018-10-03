package ii_collections

import ii_collections.data.*
import org.junit.Assert.assertEquals
import org.junit.Test

class N23CompoundTasksKtTest {
    @Test fun testGetCustomersWhoOrderedProduct() {
        assertEquals(setOf(customers[mumbai], customers[kolkatha]), shop.getCustomersWhoOrderedProduct(idea))
    }

    @Test fun testMostExpensiveDeliveredProduct() {
        val testShop = shop("test shop for 'most expensive delivered product'",
                customer(hyderabad, hyd_chi_city,
                        order(idea, isDelivered = false),
                        order(samsung)
                )
        )
        assertEquals(samsung, testShop.customers[0].getMostExpensiveDeliveredProduct())
    }

    @Test fun testNumberOfTimesEachProductWasOrdered() {
        assertEquals(4, shop.getNumberOfTimesProductWasOrdered(idea))
    }

    @Test fun testNumberOfTimesEachProductWasOrderedForRepeatedProduct() {
        assertEquals("A customer may order a product for several times",
                3, shop.getNumberOfTimesProductWasOrdered(samsung))
    }

    @Test fun testNumberOfTimesEachProductWasOrderedForRepeatedInOrderProduct() {
        assertEquals("An order may contain a particular product more than once",
                3, shop.getNumberOfTimesProductWasOrdered(redmi))
    }
}
