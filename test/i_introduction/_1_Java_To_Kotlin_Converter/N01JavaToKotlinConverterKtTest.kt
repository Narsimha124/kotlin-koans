package i_introduction._1_Java_To_Kotlin_Converter

import org.junit.Assert.assertEquals
import org.junit.Test

class N01JavaToKotlinConverterKtTest {
    @Test fun collection() {
        assertEquals("{1, 2, 3, 4, 25}", task1(listOf(1, 2, 3, 4, 5)).toString())
    }
}
