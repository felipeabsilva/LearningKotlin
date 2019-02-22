package exercises.manyParameters

fun sumAllParameters(vararg values: Int) = values.sum()

fun <T> sumAllGenericParameters(vararg values: T): Double {
    var sum: Double = 0.0

    for (value in values) {
        if (value is Double)
            sum += value
        else if (value is Int)
            sum += value.toDouble()
    }

    return sum
}
