package objectOrientation

enum class Priority(val id: Int) {
    LOW(1) {
        override fun toString(): String {
            return "Essa é unica do LOW!"
        }
    }, MEDIUM(5), HIGH(10), CRITICAL(20);

    override fun toString(): String {
        return "$name é da posição $ordinal"
    }
}

fun main(args: Array<String>) {
    for (value in Priority.values()) {
        if (value === Priority.CRITICAL) println("Isso é muito importante!")
        else {
            println(value.id)
            println(value)
        }
    }
}