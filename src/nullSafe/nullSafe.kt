package nullSafe

fun main(args: Array<String>) {
    val str: String? = null
    println(str?.length)

    //It's the same thing as
    if (str != null) println(str.length)

    val nullJavaExample = NullJavaExample()
    println(nullJavaExample.name)
    println(nullJavaExample.age)

    val nullJavaExampleNull = NullJavaExample.getInstance()
    println(nullJavaExampleNull?.age)
    println(nullJavaExampleNull?.name?.length)

    val strError: String? = null
    println(strError!!.length)
}