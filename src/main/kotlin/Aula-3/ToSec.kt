fun main() {
    println("Time Decomposer!!")
    println("Insert Hours:") 
    val h1: Double = readln().toDouble()
    println("Insert Minutes:") 
    val m1: Double = readln().toDouble()
    println("Insert Seconds:")       
    val s1: Double = readln().toDouble()
    val sum: Int = h1.toInt()*3600 + m1.toInt()*60 + s1.toInt()
    println("Inserted Hours: $h1; Inserted Minutes: $m1; Inserted Seconds: $s1")
    println("Total time in seconds: $sum ")
    
}