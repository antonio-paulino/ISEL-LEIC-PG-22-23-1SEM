package `Aula-8`

fun main() {
    val str: String = "Bom dia"
    println(str.length)
    println(str.first())
    println(str.last())
    println(str[str.length -1])
    for(ch in str)
        println(ch)
// ou
/*for(i in 0..str.length -1)
            println(str[i])

    val words: List<String> = str.split(" ")

    // list<string> = lista imutável
    println(words)
    */
}
fun digitToInt(ch :Char): Int{
    if(ch !in '0'..'1')
        throw Exception ("Esta char n é um algarismo")
    else
        return ch - '0'
}