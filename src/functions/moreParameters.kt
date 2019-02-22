package functions

fun manyParameters(vararg name: String) {
    println("There are ${name.size} parameters")
}

fun <T> oneMoreManyParameters(vararg name: T) {
    for (x in name) {
        if(x is Int)
            println("The number is: $x")
        else if (x is String)
            println("The string is: $x")
    }
}

fun main(args: Array<String>) {
    manyParameters("Felipe", "Augusto", "Aurilia", "Matheus", "Lídia")
    oneMoreManyParameters("Felipe", 1, 2, "Matheus", 3)
}