
import kotlin.math.roundToInt

fun main() {
    val value = readln().toFloat()
    val val_int = value.toInt()
    val val_fl = ((value - val_int)*100).roundToInt()

    var e2 = val_int/2
    var e1 = val_int%2
    var c50 = val_fl/50
    var c20 = (val_fl%50)/20
    var c10 = (val_fl%20)/10
    var c5 = (val_fl%10)/5
    var c2 = (val_fl%5)/2
    var c1 = (val_fl%2)

    println("$e2 $e1 $c50 $c20 $c10 $c5 $c2 $c1")




}