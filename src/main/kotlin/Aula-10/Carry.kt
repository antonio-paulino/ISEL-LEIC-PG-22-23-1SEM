package `Aula-10`

fun num(str: String): String {
    return if (str.length == 1) {
        "00" + str
    } else return if (str.length == 2)
        "0" + str
    else str
}

fun main() {
    println("Introduza o primeiro número")
    val str1: String = num(readln())
    println("Introduza o segundo número")
    val str2: String = num(readln())

    println("Números após adicionar zeros à esquerda $str1 e $str2")

    if (str1.length < str2.length)
        println("O número de digitos do primeiro número tem que ser maior ou igual ao do segundo ")

    val sumDig3: Int = ((str1[2] - '0') + (str2[2] - '0'))

    val sumDig2: Int = ((str1[1] - '0') + (str2[1] - '0')) * 10 + sumDig3

    val sum: Int = ((str1[0] - '0') + (str2[0] - '0')) * 100 + sumDig2

    val sumStr: String = num(sum.toString())

    val carryDig1: Boolean = sum > 999

    val carryDig2: Boolean = sumDig2 > 99

    val carryDig3: Boolean = sumDig3 > 9

    val sumStr1: Char = sumStr[0]
    val sumStr2: Char = sumStr[1]
    val sumStr3: Char = sumStr[2]

    println("Unidades : $sumStr3 carry nas unidades? $carryDig3")
    println("Dezenas : $sumStr2 carry nas dezenas? $carryDig2")
    println("Centenas : $sumStr1 carry nas centenas? $carryDig1")
    println("Soma : $sum")
}