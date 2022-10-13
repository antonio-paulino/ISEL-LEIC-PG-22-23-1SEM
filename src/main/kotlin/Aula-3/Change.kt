import kotlin.math.* 


fun main() {
    println("Enter product price in Euros: ")
    val p1: Double = readln().toDouble()
    println("Enter the payment in Euros: ")
    val p2: Double = readln().toDouble()
    val p3 = p1 - p2
    if (p3 > 0) {
        println("Still missing $p3 Euros")
        println("Enter the missing payment")
        val pm: Double = readln().toDouble()
        val p4 = abs(pm - p3)

        if (p4 >= 0) {
            println("Your change is $p4 Euros")
            println("Ending...")
        } else {
            println("Still missing $p4 Euros")
            println("Enter the missing payment")
            val pm1: Double = readln().toDouble()
            val p5 = abs(pm1 - p4)

            if (p5 >= 0) {
                println("Your change is $p5 Euros")
                println("Ending...")
            }
        }

    }
}
