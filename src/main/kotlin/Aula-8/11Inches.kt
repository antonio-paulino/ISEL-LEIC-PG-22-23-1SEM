package `Aula-8`

import kotlin.math.*

fun main() {
    println("Indique a operação a realizae ( C - centimetros para inches ou I inches to centimetros)")
    val line: String = readln()
    val char: Char = line[0]
    if (char == 'C') {
        println("Indique os centimetros")
        val cm: Double = readln().toDouble()
        val inches: Double = ((cm * 0.39370) * 100.0).roundToInt() / 100.0
        println("O valor indicado é de $cm centimetros. O valor convertido é $inches inches")
    }
    if (char == 'I') {
        println("Indique inches")
        val inches2: Double = readln().toDouble()
        val cm2: Double = ((inches2 / 0.39370) * 100.0).roundToInt() / 100.0
        println("O valor indicado é de $inches2 inches. O valor convertido é $cm2 centimetros")
    }
    if (char != 'I' && char != 'C') {
        println("Não indicou o operador correto")
    }
}