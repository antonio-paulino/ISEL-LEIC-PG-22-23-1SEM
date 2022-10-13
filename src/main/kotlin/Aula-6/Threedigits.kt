package `Aula-6`

fun main() {
    println("Indique um numero com 3 digitos")
    val number = readln().toInt()
    val a= number%10
    val b=number/10
    val c=b%10
    val d=b/10
    println("O numero ao contrário é $a $c $d")
    val sum = a+c+d
    println("A soma dos digitos de $number é $sum")
}