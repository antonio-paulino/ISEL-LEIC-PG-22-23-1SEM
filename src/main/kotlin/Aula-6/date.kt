fun main() {
    println("Insira o dia")
    val day: Int= readln().toInt()
    println("Insira o mes")
    val month: Int= readln().toInt()
    println("Insira o ano")
    var year: Int= readln().toInt()
    val year4= year%4
    val year10= year%10
    val year400= year%400
    if (1900<year && year>2050) {
        if (!(month in 1..12)) {
            println("Mês $month fora do intervalo 1..12")
        }
        else {
            if (year4.equals(0) && !year10.equals(0) || year400.equals(0)) {
                if (month.equals(2) && day <= 29) {
                    println("A data $day/$month/$year está válida")
                } else {
                    println("Dia $day está fora do intervalo 1..29")
                }
            } else if (month.equals(2) && day <= 28) {
                println("A data $day/$month/$year está válida")
            } else {
                println("Dia $day está fora do intervalo 1..28")
            }

            if (month != 2) {


                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    if (day >= 31) {
                        println("Dia $day está fora do intervalo 1..31")
                    } else {
                        println("A data $day/$month/$year está válida")
                    }
                } else {
                    if (day >= 30) {
                        println("Dia $day está fora do intervalo 1..30")
                    } else {
                        println("A data $day/$month/$year está válida")
                    }
                }
            }
        }
    }
    else{
        println("Ano $year está fora do intervalo 1900..2050")
    }
}