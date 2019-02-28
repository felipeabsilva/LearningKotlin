package objectOrientation

abstract class AbstractExample {
    val id = 10

    fun idTest(): Boolean = id >= 10
}

interface InterfaceExample {
    fun interfaceIndentification(): String = "InterfaceExample"

    val id: Int
        get() {
            return 10
        }

    fun idTest(): Boolean

    fun idExists(): Boolean = id > 0
}

interface InterfaceAnotherExample {
    fun interfaceIndentification(): String = "InterfaceAnotherExample"
}

class Implementation: InterfaceExample, InterfaceAnotherExample {
    override fun idTest() = id >= 15

    override fun interfaceIndentification(): String {
        return super<InterfaceExample>.interfaceIndentification() + " and " + super<InterfaceAnotherExample>.interfaceIndentification()
    }
}

fun main(args: Array<String>) {
    val implementation = Implementation()

    println(implementation.interfaceIndentification())

    println(implementation.idTest())
    println(implementation.idExists())
}