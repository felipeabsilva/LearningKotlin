package exercises.extensionNumber

import org.junit.Assert
import org.junit.Test

class ExtensionNumberTest {

    @Test
    fun percentOfNumber() {
        Assert.assertEquals(10.0f, 10.0f.percentOf(100.0f), .01f)
    }
}