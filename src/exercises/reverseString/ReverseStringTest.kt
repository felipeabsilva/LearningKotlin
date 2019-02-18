package exercises.reverseString

import org.junit.Assert
import org.junit.Test

class ReverseStringTest {
    @Test
    fun reverseUsingSB() {
        Assert.assertEquals("epilef", reverseUsingSB("felipe"))
    }

    @Test
    fun reverseUsingLoop() {
        Assert.assertEquals("otsugua", reverseUsingLoop("augusto"))
    }
}