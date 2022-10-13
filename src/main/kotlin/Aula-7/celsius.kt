package `Aula-7`

fun main() {
    println("Celsius?")
    val cel: Double = readln().toDouble()
    // chamar a função
    val fahr: Double = celsiusToFarenheit(cel)
    println("$cel graus Celsius = $fahr graus Fah")
}
fun celsiusToFarenheit(celsius: Double): Double {
    val fah: Double = (celsius*1.8) + 32
    return fah
}
