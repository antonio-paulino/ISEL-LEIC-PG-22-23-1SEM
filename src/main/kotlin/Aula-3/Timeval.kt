fun main() {
    println("Time Decomposer!!")
    println("Insert Hours:") 
    val h1: Int = readln().toInt()
    println("Insert Minutes:") 
    val m1: Int = readln().toInt()
    println("Insert Seconds:")       
    val s1: Int = readln().toInt()
   
    


    println("Time validation")
    if (h1<=24 && m1<=60 && s1<=60) {
    val sumf: Int = h1.toInt()*3600 + m1.toInt()*60 + s1.toInt()
    println("Inserted Hours: $h1; Inserted Minutes: $m1; Inserted Seconds: $s1")
    
    println("Total time in seconds: $sumf ")
  
    println("Ending!!")
    
    
    }
    else {
        println("Inserted time is not correct!")   
    }
}
