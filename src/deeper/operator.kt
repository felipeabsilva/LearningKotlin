package deeper

data class Fraction(val numerator: Int, val denominator: Int) {
    operator fun plus(add: Fraction): Fraction {
        if (denominator === add.denominator) {
            return Fraction(numerator + add.numerator, denominator)
        } else {
            val common = denominator * add.denominator
            return Fraction(((common / denominator) * numerator) + ((common / add.denominator) * add.numerator),common)
        }
    }

    operator fun inc(): Fraction {
        return this
    }
}

fun main(args: Array<String>) {
    val n1 = 1
    println(n1)

    n1.plus(9)
    println(n1.plus(9))

    n1.times(5)
    println(n1)

    var f1 = Fraction(1,5)
    val f2 = Fraction(6, 9)

    println(f1 + f2)

    f1++
}