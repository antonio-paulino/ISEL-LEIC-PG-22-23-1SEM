package `Aula-8`

fun f ( char : Char ) : Char {
    if ( char in 'a'..  'z')
        return 'A' + ( char - 'a')
    else if ( char in 'A'.. 'Z')
        return 'a' + ( char - 'A')
    else
    return ' '
}
fun main () {
    val str : String = "B" + 50512
    val ch1 : Char = f ( str [0])
    val ch2 : Char = f ( str [1])
    val ch3 : Char = f ( 'A' + ( str [1] - '0') )
    val i = f ( 'A' + ( str [1] - '0') ) . code // Unicode of ‘A ’ = 65
    println ( " ch1 = $ch1 " ) ; println ( " ch2 = $ch2 " ) ;
    println ( " ch3 = $ch3 " ) ; println ( " i = $i " ) ;
}