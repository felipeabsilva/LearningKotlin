package moreAboutClasses

class Computer(val processorModel: String) {

    inner class Memory(val level: Int){
        fun getMemoryLevel(): Int {
            println(processorModel)
            return level
        }
    }
}

fun main(args: Array<String>) {
    val m1: Computer.Memory = Computer("AMD").Memory(60)

    m1.getMemoryLevel()
}