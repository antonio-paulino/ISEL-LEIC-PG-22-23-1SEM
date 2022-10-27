package `Aula-11`

import kotlin.math.*

fun main() {
    println("1º numero")
    val first: Int = readln().toInt()
    println("2º numero")
    val second: Int = readln().toInt()
    println("3º numero")
    val third: Int = readln().toInt()
    println("4º numero")
    val fourth: Int = readln().toInt()
    // distancia ente numeros
    val distance1: Int = abs(first - second)
    val distance2: Int = abs(first - third)
    val distance3: Int = abs(first - fourth)
    if (distance1 != distance2 && distance2 != distance3 && distance1 != distance3) {
        if (distance1 > distance2 && distance3 > distance2)
            println("Mais proximo: $third")
        if (distance1 < distance2 && distance1 < distance3)
            println("Mais proximo: $second")
        if (distance3 < distance1 && distance3 < distance2)
            println("Mais proximo: $fourth")
    } else {
        if (distance3 == distance2 && distance2 < distance1)
            println("Mais proximo: $distance2. Existem 2 valores mais proximos")
        else
            println("Mais proximo: $distance1")

        if (distance1 == distance2 && distance1 < distance3)
            println("Mais proximo: $distance1. Existem 2 valores mais proximos")
        else
            println("Mais proximo: $distance3")
        if (distance1 == distance3 && distance3 < distance2)
            println("Mais proximo: $distance1. Existem 2 valores mais proximos")
        else
            println("Mais proximo: $distance2")
    }
}