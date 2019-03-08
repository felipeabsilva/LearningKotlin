package exercises.vowelConsonant

fun countVowels(str: String): Int {
    val VOWELS = "aeiou"
    var quantity: Int = 0

    for(x in str) {
        if (x.toLowerCase() in VOWELS) quantity++
    }

    return quantity
}

fun countConsonants(str: String): Int {
    val CONSONANTS = "bcdfghjklmnpqrstwxyz"
    var quantity: Int = 0

    for(x in str) {
        if (x.toLowerCase() in CONSONANTS) quantity++
    }

    return quantity
}

fun countVowelsFilter(str: String): Int = str.filter { it.toLowerCase() in "aeiou" }.length