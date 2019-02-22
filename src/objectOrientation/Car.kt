package objectOrientation

class Car(var model: String, var power: Double, var maxSpeed: Int) {
    init {
        println("The car $model is created")
    }

    var currentSpeed = 0
        private set

    fun accelerate() {
        println("Accelerating... Current speed: ${++currentSpeed}")
    }

    fun brake() {
        println("Braking... Current speed: ${--currentSpeed}")
    }

    override fun toString(): String {
        return "Car(model='$model', power=$power, maxSpeed=$maxSpeed, currentSpeed=$currentSpeed)"
    }
}

fun main(args: Array<String>) {
    val bmw = Car("M5", 4.2, 350)
    val fiat = Car("Palio", 1.0, 160)

    println(bmw.toString())
    bmw.accelerate()
    bmw.accelerate()
    bmw.accelerate()
    bmw.brake()

    println(fiat.toString())
    fiat.accelerate()
    fiat.accelerate()
    fiat.accelerate()
    fiat.brake()

}