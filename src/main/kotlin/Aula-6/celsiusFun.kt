fun main() {
    println("Graus celsius?")
    val cel: Double = readln().toDouble()
    val fahr: Double = CelsiusToFahrenheit(cel) // grava o resultado
    println("$cel celsius = $fahr fahrenheit")
}
fun CelsiusToFahrenheit(celsius: Double):Double {
    val fah: Double = (celsius*1.8)+32
return fah
}