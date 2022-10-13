import kotlin.math.* 

fun main () {
    println("Introduz as coodenadas do Primeiro ponto - X")
    var x1: Double = readLine()!!.toDouble()
    println("Introduz as coodenadas do Primeiro ponto - Y ")
    var y1: Double = readLine()!!.toDouble()
    println("Introduz as coodenadas do Segundo ponto - X ")
    var x2: Double = readLine()!!.toDouble()
    println("Introduz as coodenadas do Segundo ponto - Y ")
    var y2: Double = readLine()!!.toDouble()
        var d: Double = sqrt( (x1-x2).pow(2.0) + (y1-y2).pow(2.0))
    println("A distância entre os dois pontos é de $d ")


}