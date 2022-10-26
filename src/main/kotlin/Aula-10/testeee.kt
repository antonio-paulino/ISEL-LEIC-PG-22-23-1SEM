package `Aula-10`

fun devolveInt(c: Char ): Int {
    var a: Int= 0
    when (c) {
        '0' -> a = 0
        '1' -> a = 1
        '2' -> a = 2
        '3' -> a = 3
        '4' -> a = 4
        '5' -> a = 5
        '6' -> a = 6
        '7' -> a = 7
        '8' -> a = 8
        '9' -> a = 9
        else -> a=0
    }
    return a
}

fun ValidaStrings( str: String): String{

    var strAux= "   "
    var strCopy: String= str

    if(str.length == 1) {
        strAux="00" + str
        strCopy= strAux

    }
    if(str.length == 2) {
        strAux="0" + str
        strCopy= strAux

    }
    return strCopy
}

fun Somadigt( str1: String, str2: String): Int {
    var resultTotal: Int=0
    var resultunidades: Int=0
    var resultdezenas: Int=0
    var resultcentenas: Int=0
    var carry: Int=0
    if( devolveInt(str1[2]) + devolveInt(str2[2])+ carry> 9 ) {
        resultunidades= ((devolveInt(str1[2]) + devolveInt(str2[2]))-10)
        println(" Unidades: $resultunidades , Carry nas Unidades? True")
        carry=1
    }
    else {

        resultunidades= devolveInt(str1[2]) + devolveInt(str2[2])
        println(" Unidades: $resultunidades , Carry nas Unidades? False")
        carry=0
    }

    if( devolveInt(str1[1]) + devolveInt(str2[1])+ carry> 9 ) {
        resultdezenas= (devolveInt(str1[1]) + devolveInt(str2[1])+carry) -10
        println(" Dezenas: $resultdezenas , Carry nas Dezenas? True")
        carry=1

    }
    else {

        resultdezenas= devolveInt(str1[1]) + devolveInt(str2[1])+ carry
        println(" Dezenas: $resultdezenas , Carry nas Dezenas? False")
        carry=0
    }

    if( devolveInt(str1[0]) + devolveInt(str2[0])> 9 + carry) {
        resultcentenas= (devolveInt(str1[0]) + devolveInt(str2[0])+carry) -10
        println(" Centenas: $resultcentenas , Carry nas centenas? True")
        carry=1
        resultTotal+=1000
    }
    else {
        resultcentenas= devolveInt(str1[0]) + devolveInt(str2[0])+carry
        println(" Centenas: $resultcentenas , Carry nas Centenas? False")
        carry=0
    }

    resultTotal= resultunidades+ resultdezenas*10+ resultcentenas*100+resultTotal
    return resultTotal
}

fun main() {

    // ler duas strings
    println(" Digite a primeira string")
    var str1: String= readln()
    println(" Digite a segunda string")
    var str2: String= readln()

    str1= ValidaStrings(str1)
    str2= ValidaStrings(str2)
    println("A primeira string é: $str1")
    println("A segunda string é: $str2")
    println(" A soma= ${Somadigt(str1,str2)}")


}


