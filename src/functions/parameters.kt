package functions


fun writeAdress(street: String, number: Int = 0, city: String, state: String, cep: String = "") {
    println("Rua: $street, $number")
    println("Cidade: $city, $state - $cep")
}

fun main(args: Array<String>) {
    writeAdress("Felipeira", 5, "Osasco", "SP", "65889-470")
    writeAdress(street = "Felipeira", city = "Osasco", state = "SP")
}