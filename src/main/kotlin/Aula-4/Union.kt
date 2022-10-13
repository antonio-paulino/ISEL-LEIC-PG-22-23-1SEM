package `Aula-4`

fun main() {
    val x1 = readln().toInt()
    val y1 = readln().toInt()
    val x2 = readln().toInt()
    val y2 = readln().toInt()

    var xf = 0
    var yf = 0

    if (x1 < x2) {
        xf = x1
    }else {
        xf = x2
    }

    if (y1 > y2) {
        yf = y1
    }else {
        yf = y2
    }

    println("[$xf, $yf]")
}