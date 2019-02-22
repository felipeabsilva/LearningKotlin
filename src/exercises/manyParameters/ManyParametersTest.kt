package exercises.manyParameters

import org.junit.Assert
import org.junit.Test

class ManyParametersTest {
    @Test
    fun sumAllParameters() {
        Assert.assertEquals(20, sumAllParameters(6, 4, 2, 8))
    }

    @Test
    fun sumAllGenericParameters() {
        Assert.assertEquals(10.0, sumAllGenericParameters("", 6.0, "20", 4), .01)
    }
}