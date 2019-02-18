package basics


fun ageTest(age: Int): Boolean = age >= 18
fun biggerNumber(number1: Int, number2: Int) = if (number1>number2) number1 else number2

//Returns the string
fun getName() = "Felipe Augusto"

//Returns the double
fun getTall(): Double = 1.94

fun main(args: Array<String>) {
    val age = 18
    if(ageTest(age)) println("The age is $age") else println("The age is lower than 18")

    println("The name is ${getName()}")
    println("The tall is " + getTall())
    println("The bigger number is " + biggerNumber(15, 29))
}