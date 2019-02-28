package objectOrientation

//This class cannot be an instance
abstract class Employee(val name: String, var age: Int) {
    abstract fun adress(): String
}

class Analyst(name: String, age: Int): Employee(name, age) {
    override fun adress() = "Rua Bahia, 73 - Rochdale"
}

fun main(args: Array<String>) {
    val func = Analyst("Felipe Silva", 21)
    println(func.adress())
}

