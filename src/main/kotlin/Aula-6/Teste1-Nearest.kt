package `Aula-6`

import kotlin.math.*

fun main() {
    println("Numero?")
    val n1: Int = readln().toInt()
    println("Numero?")
    val n2: Int = readln().toInt()
    println("Numero?")
    val n3: Int = readln().toInt()
    println("Numero?")
    val n4: Int = readln().toInt()
    val diff = abs(n1 - n2)
    val diff2 = abs(n1 - n3)
    val diff3 = abs(n1 - n4)
    if (!(diff.equals(diff2)) && !diff.equals(diff3) && !diff2.equals(diff3)) {
        if (diff < diff2 && diff < diff3) { //diff menor
            println("Mais proximo: $n2 ")
        }
        if (diff > diff2 && diff2 < diff3) { //diff2 menor
            println("Mais proximo: $n3")
        }
        if (diff > diff3 && diff2 > diff3) { // diff3 menor
            println("Mais proximo: $n4")
        }
    } else {
        if (diff.equals(diff2)) {
            if (diff2 > diff3 || diff > diff3)
                println("Mais proximo: $n4")
            else
                println("Existem 2 valores mais proximos: $n2 e $n3.")
        }
        if (diff.equals(diff3)) {
            if (diff2 < diff3 || diff2 < diff)
                println("Mais proximo: $n3")
            else
                println("Existem 2 valores mais proximos: $n2 e $n4.")
        }
        if (diff2.equals(diff3)) {
            if (diff2 > diff || diff < diff3)
                println("Mais proximo: $n2")
            else
                println("Existem 2 valores mais proximos: $n3 e $n4.")
        }

    }
}

