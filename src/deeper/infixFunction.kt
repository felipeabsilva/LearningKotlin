package deeper

class Person(val name: String) {
    infix fun isName(value: String) = value.equals(name)
}

infix fun Int.isHalfOf(value: Int) = (value/2) == this

fun main(args: Array<String>) {
    10.isHalfOf(20)
    10 isHalfOf 30

    val p1 = Person("Felipe")
    p1 isName "Felipe"

}