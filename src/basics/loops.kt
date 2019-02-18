package basics

fun main(args: Array<String>) {
    var str = ""
    for (x in 1..10)
        str = "$str $x"

    println(str)

    str = ""
    val interval = 0..20
    for (x in interval step 2)
        str = "$str $x"

    println(str)

    str = ""
    for(x in 19 downTo 0 step 2)
        str = "$str $x"
    println(str)

}