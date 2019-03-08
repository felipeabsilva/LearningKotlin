package collections

/**
 * Classe de comida que usa outra classe como parâmetro
 * */
data class Food(val name: String, val calories: Double, val ingredients: List<Ingredients> = listOf())

/**
 * Ingredientes
 * */
data class Ingredients(val name: String, val quantity: Int)

/**
 * Verifica se existe ingrediente
 * */
fun hasIngredient(list: List<Ingredients>, name: String): Boolean {
    return list.filter { it.name == name }.any()
}

fun main(args: Array<String>) {

    // Cria lista de dados
    val data = listOf(
            Food("Lasanha", 1200.0,
                    listOf(Ingredients("Farinha", 1),
                            Ingredients("Presunto", 5),
                            Ingredients("Queijo", 10),
                            Ingredients("Molho de tomate", 2),
                            Ingredients("Manjerição", 3)
                    )
            ),
            Food("Panqueca", 500.0),
            Food("Omelete", 200.0),
            Food("Parmegiana", 700.0),
            Food("Sopa de feijão", 300.0),
            Food("Hamburguer", 2000.0,
                    listOf(Ingredients("Pão", 1),
                            Ingredients("Hamburguer", 3),
                            Ingredients("Queijo", 1),
                            Ingredients("Catupiry", 1),
                            Ingredients("Bacon", 3),
                            Ingredients("Alface", 1),
                            Ingredients("Tomate", 1)
                    )
            )
    )

    // Tenho receitas na lista?
    println("${if (data.any()) "Tenho receitas na lista!" else "Não tenho receitas na lista!"}")

    // Quantas receitas tenho na coleção?
    println("Tenho ${data.count()} receitas!")

    // Qual a primeira e última receita?
    println("A primeira receita é ${data.first().name}")
    println("A última receita é ${data.last().name}")

    // Qual a soma de calorias?
    val sumCalories = data.sumByDouble { it.calories }
    println("A soma de calorias é $sumCalories")

    // Me dê as duas primeiras receitas
    println("As duas primeiras receitas são:")
    val firstTwo = data.take(2)
    for (value in firstTwo.withIndex()) println("${value.index + 1} - ${value.value.name}")

    // Sei como fazer panqueca? E sushi?
    val knowPancake = data.filter { it.name === "Panqueca" }.any()
    println("${if (knowPancake) "Sei fazer panqueca!" else "Não sei fazer panqueca!"}")

    val knowSushi = data.filter { it.name === "Sushi" }.any()
    println("${if (knowSushi) "Sei fazer sushi!" else "Não sei fazer sushi!"}")

    // Quais são as comidas com mais de 500 calorias?
    val more500 = data.filter { it.calories > 500 }.forEach { println(it.name) }

    // Par (chave, valor) de comidas com mais de 500 calorias (name, calories)
    data.filter { it.calories > 500 }.map { Pair(it.name, it.calories) }.forEach { println("A comida ${it.first} tem ${it.second}") }

    // Quais das receitas possui farinha como ingrediente?
    val result = data.filter { hasIngredient(it.ingredients, "Farinha") }.forEach { println(it.name) }


}

