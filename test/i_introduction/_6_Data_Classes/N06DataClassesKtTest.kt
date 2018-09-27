package i_introduction._6_Data_Classes

import org.junit.Assert.assertEquals
import org.junit.Test


class N06DataClassesKtTest {
    @Test fun testListOfPeople() {
        assertEquals("[Person(name=Alice, age=29)]", getAllInfo().toString())
    }
}