package `Aula-4`

fun main() {
    //media
    val n1 = readln().toInt()
    val n2 = readln().toInt()
    val n3 = readln().toInt()
    val n4 = readln().toInt()

    var f = 0
    var lower = ""

    if (n1>n2 && n1>n3 && n1>n4) {
        f += (n2+n3+n4)
        lower = "$n2 $n3 $n4"
    }else if (n2>n1 && n2>n3 && n2>n4) {
        f += (n1+n3+n4)
        lower = "$n1 $n3 $n4"
    }else if (n3>n1 && n3>n3 && n3>n4) {
        f += (n1+n2+n4)
        lower = "$n1 $n2 $n4"
    }else {
        f += (n1+n2+n3)
        lower = "$n1 $n2 $n3"
    }

    val med = f/4

    if (med > 8) {
        println(med)
    }else {
        println("Reprovado")
    }
    println(lower)
}