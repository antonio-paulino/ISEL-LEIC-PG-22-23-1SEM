package `Aula-3`

import kotlin.math.*

fun main() {
    println("Indique a quantia em Euros")
    var amount: Double = readln().toDouble()
    val amountCent: Int =  (amount*100).roundToInt()
    val m200 = amountCent/200
    val remainder = amountCent%200
    val m100 = remainder/100
    val rem = remainder%100
    val m50 = rem/50
    val rem2= rem%50
    val m20 = rem2/20
    val rem3 = rem%20
    val m10 = rem3/10
    val rem4= rem3%10
    val m5 =rem4/5
    val rem5= rem4%5
    val m2 = rem5/2
    val rem6 = rem5%2
    val m1 = rem6/1


    println(" 1c $m1")
   println(" 50c $m50")
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
            print("$m1 x 0.01 Eur")
        }
        else{
            first = false
        }
    }
    





}