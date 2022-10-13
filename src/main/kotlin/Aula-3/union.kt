package `Aula-3`

fun main() {
    println("Insira o 1º valor de A")
    val a1 = readln().toInt()
    println("Insira o 2º valor de A")
    val a2 = readln().toInt()
    println("Insira o 1º valor de B")
    val b1 = readln().toInt()
    println("Insira o 2º valor de B")
    val b2 = readln().toInt()
    val conj: IntRange = (a1..a2)
    val conj1: IntRange = (b1..b2)
    val c1 = (a2-b1)
    val common = conj.intersect(conj1) // uso de uma função já existente (intersect) => interceção 
     if (c1<=0) {
        val sumconj = (conj + conj1)
        println("Os conjuntos A e B não se intersetam.")
        println("A+B = $sumconj ")
          
    }
     else {
        println("Os conjuntos intersetam-se em: $common")   
            
        }
}
