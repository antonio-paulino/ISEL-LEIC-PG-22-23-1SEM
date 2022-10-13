fun main () {

    println("Introduza um numero com um  maximo de 3 digitos")
    val x1: Int = readln().toInt()
    val x2: Int = (x1/10)
    val x3: Int = (x2/10)
    val x4: Int = (x2%10)
    val x5: Int = (x1%10)
    val x6: Int = (x3 + x4 + x5) 
    
    println("A soma dos digitos é $x6 ")


}