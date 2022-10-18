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
for(i in 0..str.length -1)
            println(str[i])

    val words: List<String> = str.split(" ")

    // list<string> = lista imutável


    println(words)
}