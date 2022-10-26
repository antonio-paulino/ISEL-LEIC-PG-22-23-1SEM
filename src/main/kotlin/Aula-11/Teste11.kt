package `Aula-11`

fun main() {
    println("introduza o primeiro")
    val first: String = num(readln())
    println("introduza o segundo")
    val second: String = num(readln())
    println("Numeros após adicionar zeros à esquerda: $first e $second")
    val sum1: Int = (first[0] - '0') * 100 + (first[1] - '0') * 10 + (first[2] - '0')
    val sum2: Int = (second[0] - '0') * 100 + (second[1] - '0') * 10 + (second[2] - '0')
    val sum3: Int = sum1 + sum2
    val sumf: String = (sum1 + sum2).toString()
    println("Soma = $sumf")
    val sums1: Char = sumf[2]
    val sums2: Char = sumf[1]
    val sums3: Char = sumf[0]
    var carry1: Boolean // unidades
    var carry2: Boolean // dezenas
    var carry3: Boolean // centenas
    if (sum3 > 9)
        carry1 = true
    else carry1 = false
    if (sum3 > 99)
        carry2 = true
    else carry2 = false
    if (sum3 > 999)
        carry3 = true
    else carry3 = false
    println("Unidades : $sums1 , Carry nas Unidades ? $carry1")
    println("Dezenas : $sums2 , Carry nas Dezenas ? $carry2")
    println("Centenas : $sums3 , Carry nas Centenas ? $carry3")
}

fun num(first: String): String {
    var strf: String = "0"
    if (first.length == 1)
        strf = "00" + first
    else if (first.length == 2)
        strf = "0" + first
    else if (first.length == 3)
        strf = first
    return strf
}