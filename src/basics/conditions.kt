package basics

fun whatHappened(year: Int): String =
        if (year == 2019)
            "The year I learned Kotlin"
        else if (year in 2018..2014)
            "I was just living"
        else if (year == 2013)
            "The year I met the love of my life"
        else if (year <= 2012)
            "I don't remember"
        else
            "I don't know"

fun whatHappenedUsingWhen(year: Int): String {
    when (year) {
        2019 -> return "The year I learned Kotlin"
        2018, 2017, 2016, 2015, 2014 -> return "I was just living"
        2013 -> return "The year I met the love of my life"
        else -> return "I don't remember"
    }
}

fun whatHappenedUsingTheSuperWhen(year: Int): String =
    when {
        (year == 2019) -> "The year I learned Kotlin"
        (year in 2018..2014) -> "I was just living"
        (year == 2013) -> "The year I met the love of my life"
        else -> "I don't remember"
    }

fun main(args: Array<String>) {
    println(whatHappened(2019))
    println(whatHappenedUsingWhen(2016))
    println(whatHappenedUsingTheSuperWhen(2013))
    println(whatHappenedUsingTheSuperWhen(2012))
}