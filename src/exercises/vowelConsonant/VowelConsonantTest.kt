package exercises.vowelConsonant

import org.junit.Assert
import org.junit.Test

class VowelConsonantTest {
    @Test
    fun countVowels() {
        Assert.assertEquals(7, countVowels("Felipe is programming"))
    }

    @Test
    fun countConsonants() {
        Assert.assertEquals(12, countConsonants("Felipe is programming"))
    }

    @Test
    fun countVowelsAndConsonants() {
        val str = "Felipe is programming in Kotlin"
        Assert.assertEquals(10, countVowels(str))
        Assert.assertEquals(17, countConsonants(str))
    }
}