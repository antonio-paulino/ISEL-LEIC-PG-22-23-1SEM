fun main() {
    println("Insira a nota do primeiro teste")
    var n1: Double = readln().toDouble()
    println("Insira a nota do segundo teste")
    var n2: Double = readln().toDouble()
    println("Insira a nota do terceiro teste")
    var n3: Double = readln().toDouble()
    println("Insira a nota do quarto teste")
    var n4: Double = readln().toDouble()
    var low: Double = n1
    if (n2<low){
        n2=low
    }
            else{ 
                if(n3<low){
                n3=low
                }    
            else{
                if(n4<low){
                n4=low
                }
            }
            }
    val med: Double= (n1+n2+n3+n4-low)/3
    if(med>8){
    println("Está aprovado. A media dos 3 melhores testes é de $med")
    }
    else{
    println("Está reprovado")
    }
}