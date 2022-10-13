import kotlin.math.*

fun main() {
    println("Indique o preço")
    val price= readln().toDouble()
   // val euro =
    val cents= price*100
    println("O preço indicado foi de $price euros que corresponde a $cents centimos")
    println("Indique o desconto a fazer")
    val dis= readln().toDouble()
    val final= ((price-price*(0.01*dis))*100.0).roundToInt() /100.0 
    println("Preço final = $price - $dis % = $final")
}
