fun main(){
println("Indique o primeiro numero")
var n1: Int = readln().toInt()
println("Indique o segundo numero")
var n2: Int = readln().toInt()
println("Indique o terceiro numero")
var n3: Int = readln().toInt()
        if (n1>n2 && n2>n3) {
    println("$n1 > $n2 > $n3 ")
        }
        if (n1>n3 && n2<n3) {
    println("$n1 > $n3 > $n2 ")
        }
        if (n2>n1 && n1>n3) {
    println("$n2 > $n1 > $n3 ")
        }
        if (n2>n3 && n1<n3 ) {
    println("$n2 > $n3 > $n1 ")
        }
        if (n3>n2 && n1<n2) {
    println("$n3 > $n2 > $n1 ")
        }
        if (n3>n1 && n1>n2) {
    println("$n3 > $n1 > $n2 ")
        }
}