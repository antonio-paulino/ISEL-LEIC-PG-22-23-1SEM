fun main() {
	println("Time decomposer - (decompor segundos em horas/minutos/segundos)")
		println("Indique os segundos!")
		val x: Double = readLine()!!.toInt().toDouble()
		val horas: Int = x.toInt()/3600
		val minutos: Int = x.toInt()/60 - 60*horas
		val segundos: Int = x.toInt() - (60*minutos + 3600*horas) 
	println("Horas: $horas ")
	println("Minutos: $minutos ") 
	println("Segundos: $segundos ")
	readln()

}