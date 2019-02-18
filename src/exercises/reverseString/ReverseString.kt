package exercises.reverseString

fun reverseUsingSB(str: String): String {
    return StringBuilder(str).reverse().toString()
}

fun reverseUsingLoop(str: String): String {
    var sbPhrase = StringBuilder()
    val i = str.length - 1

    for(x in i downTo 0)
        sbPhrase.append(str[x])

    return sbPhrase.toString()
}