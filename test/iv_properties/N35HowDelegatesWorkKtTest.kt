package iv_properties

import iii_conventions.MyDate
import org.junit.Assert.assertEquals
import org.junit.Test

class N35HowDelegatesWorkKtTest {
    @Test fun testDate() {
        val delegateInfo = DelegateInfo()
        /* Month numbering starts with 0 (0-Jan, 1-Feb, ... 11-Dec) */
        delegateInfo.date = MyDate(2018, 1, 12)
        assertEquals(2018, delegateInfo.date.year)
        assertEquals(1, delegateInfo.date.month)
        assertEquals(12, delegateInfo.date.dayOfMonth)
    }
}
