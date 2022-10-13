fun main() {
    println("1º operador?")
    var op1 = readln().toDouble()
    println("2º operador?")
    var op2 = readln().toDouble()
    println("Indique o operador ( +, -, x, /, %)")
    var opr: Char = readln()[0]
    var res: Double = 0.0
    when (opr) {
        '+' -> res = op1 + op2
        '-' -> res = op1 - op2
        'x' -> res = op1 * op2
        '/' -> res = op1 / op2
        '%' -> res = op1 % op2
    }
    println("$op1 $opr $op2 = $res")
}
    /*else{ 
        /*if(res.equals(0)){
            println("$op1 $opr $op2 = $res")
        }
        println("Erro")
    } */