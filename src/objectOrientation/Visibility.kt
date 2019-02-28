package objectOrientation

open class Truck(val model: String) {
    private var velocity: Int = 0

    fun accelerate(): Int {
        velocity += 10
        return velocity
    }

    fun getVelocity(): Int {
        return velocity
    }
}

class Volkswagen(model: String): Truck(model) {
    fun brake() {
        getVelocity() -+ 10
    }
}

fun main(args: Array<String>) {
    val volks = Volkswagen("VW 8150")
}