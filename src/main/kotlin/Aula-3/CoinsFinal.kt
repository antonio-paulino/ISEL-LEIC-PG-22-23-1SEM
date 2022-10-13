package `Aula-3`

import kotlin.math.*

fun main() {
    println("Indique a quantia em Euros")
    var amount: Double = readln().toDouble()
    val amountCent: Int =  (amount*100).roundToInt()
    val m1 = amount%1
    val m200 = amountCent/200
    val remainder = amountCent%200
    val m100 = remainder/100
    val rem = 0


   val m50 = 0
   val m20 = 0
  val m10 = 0
   val m5 = 0
    val m2 =0
    println(" 1c $m1")
//    println(" 10c $m10")
//   println(" 20c $m20")
 ////   println(" 50c $m50")
    println(" 1e $m100")
    println(" 2e $m200")




    var first : Boolean = true
    if (m200>0){
        if (first == false)
            print("f")
        else {
            first = false
            print("$m200 x 2Eur")
        }

        if (m100>0){
            if (first == false){
                print(" + ")
                print("$m100 x 1Eur")
            }
        }
        else {
            first = false
        }
    }
    if (m50>0){
        if (first == false){
            print(" + ")
            print("$m50 x 0.50Eur")
        }
        else {
            first = false
        }
    }
    if (m20>0){
        if (first == false){
            print(" + ")
            print("$m20 x 0.20Eur")
        }
        else{
            first = false
        }
    }
    if (m10>0){
        if (first == false){
            print(" + ")
            print("$m10 x 0.10Eur")
        }
        else {
            first = false
        }
    }
    if (m5>0){
        if (first == false){
            print(" + ")
            print("$m5 x 0.05Eur")
        }
        else {
            first = false
        }
    }
    if (m2>0){
        if (first == false){
            print(" + ")
            print("$m2 x 0.02Eur")
        }
        else{
            first = false
        }
    }
    if (m1>0){
        if (first == false){
            print("+")
            print("$m1 x 0.01")
        }
        else{
            first = false
        }
    }
    





}