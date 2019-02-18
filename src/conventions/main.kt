package conventions

class Person

class Pet

var name: String = "Felipe"
val lastName = "Augusto"

val age: Int = 21
val tall: Double = 1.94

fun printName(name: String, lastName: String) {
    println("My name is $name $lastName")
}

fun printInformations() {
    println("""There are more information about me:
        My age is $age
        |My tall is $tall
    """.trimMargin())
}

fun main(args: Array<String>) {
    printName(name, lastName)
    printInformations()

    val numCharacters = name.length

    println("The number of characters of my name is $numCharacters")
    println("The first character of my name is ${name[0]}")
}

