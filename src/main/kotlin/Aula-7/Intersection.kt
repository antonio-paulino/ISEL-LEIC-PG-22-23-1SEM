package `Aula-7`


fun main() {
        println("Insira o 1º valor de A")
        val a1 = readln().toInt()
        println("Insira o 2º valor de A")
        val a2 = readln().toInt()
        println("Insira o 1º valor de B")
        val b1 = readln().toInt()
        println("Insira o 2º valor de B")
        val b2 = readln().toInt()
        if(a2<b1 || b2<a1) {
                println("Os conjuntos não se intersetam")
        }
        else if(a2>b1 ){
                println("Os conjuntos intersetam-se em [$a1, $b2]")
        }
        else if(a1>b2){
                println("Os conjuntos intersetam-se em [$a1, $b2]")
        }
}
