package moreAboutClasses

class Car(val model: String, val maxSpeed: Int) {
    var currentSpeed: Int = 0
        set(value) {
            if (value > maxSpeed) {
                throw Exception("Velocidade maior que a permitida!")
            } else
                field = value
        }
}

fun main(args: Array<String>) {
    val c1 = Car("Toyota Corolla", 200)
    c1.currentSpeed = 500
}