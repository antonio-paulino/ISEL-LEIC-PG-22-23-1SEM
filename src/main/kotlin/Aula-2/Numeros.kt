fun main() {
 println("Enter Two number")
 var (a, b) = readln().split(' ') 
 println("Max number is : ${maxNum(a.toInt(), b.toInt())}")
}
fun maxNum(a: Int, b: Int): Int {
 var max = if (a > b) {
 println("The value of a is $a");
 a
 } else {
 println("The value of b is $b");
 b
 }
 return max;
}
