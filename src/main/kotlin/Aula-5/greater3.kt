fun main() {
    println("Indique o primeiro numero")
    var n1: Double = readln().toDouble()
    println("Indique o primeiro numero")
    var n2: Double = readln().toDouble()
    println("Indique o primeiro numero")
    var n3: Double = readln().toDouble()
// var (n1,n2,n3) = readln().split(' ') n se pode usar pq o uso de split permite inserir strings
    if (n1 > n2 && n1 > n3) {
        println("$n1 é o maior numero inserido")
    }

    if (n1 < n2 && n2 > n3) {
        println("$n2 é o maior numero inserido")
    }

    if (n3 > n2 && n1 < n3) {
        println("$n3 é o maior numero inserido")
    }
}
