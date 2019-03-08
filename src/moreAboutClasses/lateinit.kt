package moreAboutClasses

class Repository() {
    fun execute(){}
}

class Business() {
    lateinit var repository: Repository
    lateinit var value: String

    fun execute(){
        repository = Repository()
    }
}

fun main(args: Array<String>) {

}