package collections

fun main(args: Array<String>) {
    val list1 = listOf("Felipe", "Matheus", "Lídia")
    val list2 = mutableListOf("Felipe", "Matheus", "Lídia")
    val array = arrayListOf("Felipe", "Matheus", "Lídia")

    val set1 = setOf("Felipe", "Matheus", "Lídia")
    val set2 = mutableSetOf("Felipe", "Matheus", "Lídia")

    val h1 = hashMapOf<String, String>(Pair("key", "value"), Pair("Brasil", "São Paulo"))

    val h2 = mapOf<String, String>(Pair("key", "value"), Pair("Brasil", "São Paulo"))
    val h3 = mutableMapOf<String, String>(Pair("key", "value"), Pair("Brasil", "São Paulo"))

    list2.add("Lia")
    list2.add("Augusto")
}