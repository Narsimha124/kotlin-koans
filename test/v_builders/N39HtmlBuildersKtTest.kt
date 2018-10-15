package v_builders

import org.junit.Assert.assertTrue
import org.junit.Test

class N39HtmlBuildersKtTest {
    @Test fun productTableIsFilled() {
        val result = renderProductTable()
        println("result Fields is: $result" )
        assertTrue("Product table should contain corresponding data", result.contains("cactus"))
        print("===============================")
    }
    @Test fun productTableIsColored() {
        val result = renderProductTable()
        println("result colour  is: $result")
        assertTrue("Product table should be colored", result.contains("bgcolor"))
    }
}
