package objectOrientation

open class Animal(var name: String) {
    open fun sayMyCharacteristics(): String {
        return "My name is $name"
    }
}

class Dog(name: String, val hairColor: String): Animal(name) {
    override fun sayMyCharacteristics(): String {
        return "${super.sayMyCharacteristics()}, and my hair color is $hairColor"
    }

    fun sayMyCharacteristics(age: Int): String {
        return "I'm $age years old!"
    }
}

fun main(args: Array<String>) {
    val dog = Dog("Nino", "Black")
    println(dog.sayMyCharacteristics())
    println(dog.sayMyCharacteristics(2))
}