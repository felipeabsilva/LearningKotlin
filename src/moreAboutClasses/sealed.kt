package moreAboutClasses

sealed class Result {
    class Sucess(val message: String) : Result()
    class Error(val error: String, val errorCode: Int) : Result()
}

class Repo {
    fun execute() : Result {
        return Result.Sucess("Deu certo!")
    }
}

fun main(args: Array<String>) {
    var r1 = Repo()
    val result: Result = r1.execute()
    when (result) {
        is Result.Sucess -> {
            println("Deu sucesso!")
        }
        is Result.Error -> {
            println("Deu erro!")
        }
    }
}