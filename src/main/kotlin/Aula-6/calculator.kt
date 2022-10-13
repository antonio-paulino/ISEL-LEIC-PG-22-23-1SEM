fun main() {
    println("1º operador?")
    val op1: Double = readln().toDouble()
    println("2º operador?")
    val op2: Double = readln().toDouble()
    println("Indique o operador ( +, -, x, /, %")
    val opr: Char = readln()[0]
    // declara a variavel fora do if para que esta obtenha diferentes valores e não repetir a função em cada if
    var res : Double = 0.0
    if(opr == '+')
        res = op1 + op2
    else if(opr == '-')
        res = op1 - op2
    else if(opr == 'x')
        res = op1*op2
    else if(opr == '/')
        res = op1/op2
    else if(opr == '%')
        res = op1%op2
println("$op1 $opr $op1 = $res")
     
}
/*
Nota val x: Int = if(line.lenth>1) 10 else 0
é sempre obrigatório usar else
 */





/*val line: String = readln()
    val opr: Char = line[0]
    if (line.length> 1)
    println("Erro - Introduza só 1 char")

    */