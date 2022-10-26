package `Aula-9`

fun main(){
    val str= readln() // ex: 123
    println(str.toInt())

}


fun String.toInt():Int{
    //this == str == "123"
    var dec:Int = 0 ; var pot=1
    for (i in this.length-1 downTo 0){
        dec +=(this[i]-'0')*pot
        pot*=10
    }
    return dec
}