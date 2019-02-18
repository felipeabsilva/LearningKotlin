package basics

import java.lang.Exception
import java.lang.NullPointerException
import java.lang.NumberFormatException

fun main(args: Array<String>) {
    try {
        var number: Int = "Felipe".toInt()
        println(number)
    } catch (e: NumberFormatException) {
        println("It's not a number!")
    } catch (e: NullPointerException) {
        println("There is something wrong!")
    } catch (e: Exception) {
        println("I don't know what happened!")
    } finally {
        println("Felipe is very awesome")
    }

}