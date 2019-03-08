package objectOrientation

fun main(args: Array<String>) {
    val name: String = "Felipe"

    name.equals("Matheus")
    name.capitalize()
    name.toUpperCase()
    name.decapitalize()
    name.toLowerCase()

    with (name) {
        equals("Felipe")
        capitalize()
        toUpperCase()
        decapitalize()
        toLowerCase()
    }
}