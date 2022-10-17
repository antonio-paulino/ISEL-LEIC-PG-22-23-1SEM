package `Jogo-da-memoria`

/* val SYMBOLS = "#%XO&" // Podem ser colocados mais ou menos símbolos.
fun main() {
    val pairs = (SYMBOLS+SYMBOLS).toList().shuffled()
//println(pairs)
    println("Foram gerados ${SYMBOLS.length} pares aleatórios de símbolos.")
    println("Vamos jogar!")
    var places: List<Char> = allHiddenPairs(pairs)
    var trys = 0
    do {
        println("$trys: $places")
        val first = readPosition("primeira")
        val second = readPosition("segunda")
        if ( isValidPositions(first, second, places) ) {
            places = places.play(first, second, pairs)
            trys++
        } else println("Posições inválidas")
    } while( ! isAllPairsShowed(places) )
    println("$trys: $places")
    println("Terminou o jogo usando $trys tentativas")
}
fun List<Char>.play(p1: Int, p2: Int, pairs: List<Char>): List<Char> {
    val turned = this.turnPlaces(p1, p2, pairs)
    if (turned[p1] != turned[p2]) {
        print(turned)
        repeat(4) { print('.'); Thread.sleep(1000) }
        print("\r \r")
        return this
    }
    return turned
}
*/