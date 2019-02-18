package basics

fun main(args: Array<String>) {
    var number: Int = 10

    var numberStr = number.toString()

    println("Converting directly to String: $number")
    println("String already converted: $numberStr")

    numberStr = "50"

    number = numberStr.toInt()
    println("String converted to Int: $number")


}