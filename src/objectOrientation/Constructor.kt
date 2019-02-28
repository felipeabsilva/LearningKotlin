package objectOrientation

class Pet private constructor() {
    //This class cannot be an instance
}

class Client(name: String) {
    constructor(name: String, age: Int): this(name)
}

fun main(args: Array<String>) {
    val client = Client("Felipe Silva")
    val client2 = Client("Felipe Silva", 21)
}