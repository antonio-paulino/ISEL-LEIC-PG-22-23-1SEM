fun main() {
    // Programa para ler um char e converter para minuscula ou maiúscula, apresentando tbm os codigos unicode
    println("Introduza um char:")
    val line: String = readln()
    val ch: Char = line[0]
        if (ch in 'A'..'Z'){
        val code= ch.code
        val minusc: Char= (ch + 32).toChar()
        println("Char $ch, código= $code, Minusc= $minusc")
        }
        else {
            val codem=ch.code
            val maiusc: Char = (ch-32).toChar()
            println("Char: $ch, código= $codem, Maiusc= $maiusc")
        }
}