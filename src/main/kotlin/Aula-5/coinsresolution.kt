import kotlin.math.*

/*
Apresentar o número de moedas de cada valor para uma determinada quantia em
euros, minimizando o número total de moedas. Podem ser usadas moedas de 2Eu,
1Eu, 50c, 20c, 10c, 5c, 2c e 1c. 
*/
fun main() {
    println("Quantia em euros?")
    val amount: Double= readln().toDouble()
//converter para centimos e arredondar
val amountCent: Int= (amount*100).roundToInt()
// calcular moedas de 2 euros
val m200 = amountCent/200
//nota: a divisão é inteira pq a variavel é do tipo Int
var remainder = amountCent%200
// resto da divisão inteira
// moedas de 1 euro
val m100 = remainder/100 //equivalente a : remainder % 100
remainder %= 100
// moedas de 0.50 cent
val m50 = remainder / 50
remainder %= 50 
// moedas de 20 cent
val m20 = remainder /20
remainder %= 20
// moedas de 10 cent
val m10 = remainder / 10
remainder %= 10
// moedas de 5 cent
val m5 = remainder / 5
remainder %= 5
// moedas de 2 cent
val m2 = remainder / 2
remainder %= 2
// moedas de 1 cent
val m1 = remainder / 1
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