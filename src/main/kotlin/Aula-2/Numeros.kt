package `Aula-8`
fun main() {
    println("Enter Two number")
    var (a, b) = readln().split(' ')
    println("Max number is : ${maxNum(a.toInt(), b.toInt())}")

}

fun digitAToInt(a: Char, b: Char): Int {
    if (a !in '0'..'1')
        throw Exception("Esta char n é um algarismo")
    else
        return a - '0'
}

fun digitbToInt(a: Char, b: Char): Int {
    if (b !in '0'..'1')
        throw Exception("Esta char n é um algarismo")
    else
        return b - '0'
}

fun maxNum(a: Int, b: Int): Int {
    var max = if (a > b) {
        println("The value of a is $a");
        a
    } else {
        println("The value of b is $b");
        b
    }
    return max;
}

