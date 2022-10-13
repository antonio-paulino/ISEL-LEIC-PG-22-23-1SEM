fun main() {

    println("Indique o ano")
    var ano: Int = readln().toInt()
    val nano: Int = ano%4.toInt()
    val nanog: Int = ano%400.toInt()
    val nanon: Int = ano%100.toInt()


    if (nano.equals(0) && !nanon.equals(0) || nanog.equals(0)){
        println("${ano} é ano bissexto. ")
        println("Indique o mês")
        var mesb: Int = readLine()!!.toInt()

        // val mesjb: Int
        if(mesb.equals(1)){
           // val sumjb: Int = 31
            println("Indique o dia")
            val diab: Int = readLine()!!.toInt()
            val sumf: Int = diab-1
            println("A data indicada é $sumf dias depois de 1/1/$ano")
        }
        // val mesfb: Int
        if(mesb.equals(2)){
           //  val sumfb: Int = 29
            println("Indique o dia")
            val diab: Int = readLine()!!.toInt()
            val sumf: Int = diab -1 + 31
            println("A data indicada é $sumf dias depois de 1/1/$ano")
        }
        // val mesmb: Int
        if(mesb.equals(3)){
           // val summb: Int = 31
            println("Indique o dia")
            val diab: Int = readLine()!!.toInt()
            val sumf: Int = diab -1 + 31 + 29
            println("A data indicada é $sumf dias depois de 1/1/$ano")
        }
        // val mesab: Int
        if(mesb.equals(4)){
           // val sumab: Int = 30
            println("Indique o dia")
            val diab: Int = readLine()!!.toInt()
            val sumf: Int = diab - 1 + 31 + 29 + 31
            println("A data indicada é $sumf dias depois de 1/1/$ano")
        }
        //  val mesmab: Int
        if(mesb.equals(5)){
           // val summab: Int = 31
            println("Indique o dia")
            val diab: Int = readLine()!!.toInt()
            val sumf: Int = diab - 1 + 31 + 29 + 31 + 30
            println("A data indicada é $sumf dias depois de 1/1/$ano")
        }
        // val mesjub: Int
        if(mesb.equals(6)){
           // val sumjub: Int = 30
            println("Indique o dia")
            val diab: Int = readLine()!!.toInt()
            val sumf: Int = diab - 1 + 31 + 29 + 31 + 30 + 31
            println("A data indicada é $sumf dias depois de 1/1/$ano")
        }
        // val mesjlb: Int
        if(mesb.equals(7)){
           // val sumjlb: Int = 31
            println("Indique o dia")
            val diab: Int = readLine()!!.toInt()
            val sumf: Int = diab - 1 + 31 + 29 + 31 + 30 + 31 + 30
            println("A data indicada é $sumf dias depois de 1/1/$ano")
        }
        // val mesagb: Int
        if(mesb.equals(8)){
           // val sumagb: Int = 31
            println("Indique o dia")
            val diab: Int = readLine()!!.toInt()
            val sumf: Int = diab - 1 + 31 + 29 + 31 + 30 + 31 + 30 + 31
            println("A data indicada é $sumf dias depois de 1/1/$ano")
        }
        // val messb: Int
        if(mesb.equals(9)){
          //  val sumsb: Int = 30
            println("Indique o dia")
            val diab: Int = readLine()!!.toInt()
            val sumf: Int = diab - 1 + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31
            println("A data indicada é $sumf dias depois de 1/1/$ano")
        }
        //val mesob: Int
        if(mesb.equals(10)){
           // val sumob: Int = 31
            println("Indique o dia")
            val diab: Int = readLine()!!.toInt()
            val sumf: Int = diab - 1 + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30
            println("A data indicada é $sumf dias depois de 1/1/$ano")
        }
        // val mesnb: Int
        if(mesb.equals(11)){
           // val sumnb: Int = 30
            println("Indique o dia")
            val diab: Int = readLine()!!.toInt()
            val sumf: Int = diab - 1 + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31
            println("A data indicada é $sumf dias depois de 1/1/$ano")
        }
        // val mesdb: Int
        if(mesb.equals(12)){
          //  val sumdb: Int = 31
            println("Indique o dia")
            val diab: Int = readLine()!!.toInt()
            val sumf: Int = diab - 1 + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30
            println("A data indicada é $sumf dias depois de 1/1/$ano")
        }

    }
    else{
        println("${ano} NÃO é ano bissexto. ")
        println("Indique o mês")
        var mesn: Int = readln().toInt()
        //  val mesjn: Int
        if(mesn.equals(1)){
           // val sumjn: Int = 31
            println("Indique o dia")
            val dian: Int = readLine()!!.toInt()
            val sumffn: Int = dian - 1 
            println("A data indicada é $sumffn dias depois de 1/1/$ano")
        }
        //  val mesfn: Int
        if(mesn.equals(2)){
           // val sumfn: Int = 28
            println("Indique o dia")
            val dian: Int = readLine()!!.toInt()
            val sumffn: Int = dian - 1 + 31
            println("A data indicada é $sumffn dias depois de 1/1/$ano")
        }
        //  val mesmn: Int
        if(mesn.equals(3)){
          //  val summn: Int = 31
            println("Indique o dia")
            val dian: Int = readLine()!!.toInt()
            val sumffn: Int = dian - 1 + 31 + 28
            println("A data indicada é $sumffn dias depois de 1/1/$ano")
        }
        //  val mesan: Int
        if(mesn.equals(4)){
           // val suman: Int = 30
            println("Indique o dia")
            val dian: Int = readLine()!!.toInt()
            val sumffn: Int = dian - 1 + 31 + 28 + 31
            println("A data indicada é $sumffn dias depois de 1/1/$ano")
        }
        //   val mesman: Int
        if(mesn.equals(5)){
          //  val summan: Int = 31
            println("Indique o dia")
            val dian: Int = readLine()!!.toInt()
            val sumffn: Int = dian - 1 + 31 + 28 + 31 + 30
            println("A data indicada é $sumffn dias depois de 1/1/$ano")
        }
//    val mesjun: Int
        if(mesn.equals(6)){
          //  val sumjun: Int = 30
            println("Indique o dia")
            val dian: Int = readLine()!!.toInt()
            val sumffn: Int = dian - 1 + 31 + 28 + 31 + 30 + 31
            println("A data indicada é $sumffn dias depois de 1/1/$ano")
        }
        //  val mesjln: Int
        if(mesn.equals(7)){
           // val sumjln: Int = 31
            println("Indique o dia")
            val dian: Int = readLine()!!.toInt()
            val sumffn: Int = dian - 1 + 31 + 28 + 31 + 30 + 31 + 30
            println("A data indicada é $sumffn dias depois de 1/1/$ano")
        }
        //   val mesagn: Int
        if(mesn.equals(8)){
          //  val sumagn: Int = 31
            println("Indique o dia")
            val dian: Int = readLine()!!.toInt()
            val sumffn: Int = dian - 1 + 31 + 28 + 31 + 30 + 31 + 30 + 31
            println("A data indicada é $sumffn dias depois de 1/1/$ano")
        }
        //  val messn: Int
        if(mesn.equals(9)){
           // val sumsn: Int = 30
            println("Indique o dia")
            val dian: Int = readLine()!!.toInt()
            val sumffn: Int = dian - 1 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31
            println("A data indicada é $sumffn dias depois de 1/1/$ano")
        }
        //   val meson: Int
        if(mesn.equals(10)){
           // val sumon: Int = 31
            println("Indique o dia")
            val dian: Int = readLine()!!.toInt()
            val sumffn: Int = dian - 1 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30
            println("A data indicada é $sumffn dias depois de 1/1/$ano")
        }
        //   val mesnn: Int
        if(mesn.equals(11)){
           // val sumnn: Int = 30
            println("Indique o dia")
            val dian: Int = readLine()!!.toInt()
            val sumffn: Int = dian - 1 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31
            println("A data indicada é $sumffn dias depois de 1/1/$ano")
        }
        //   val mesdn: Int
        if(mesn.equals(12)){
           // val sumdn: Int = 31
            println("Indique o dia")
            val dian: Int = readLine()!!.toInt()
            val sumffn: Int = dian - 1 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30
            println("A data indicada é $sumffn dias depois de 1/1/$ano")
        }


    }


}




// janeiro - 31, fevereiro - 29, março- 30, abril- 31, maio- 30, junho- 31, julho-30, agosto- 31, setembro- 30, outubro- 31, novembro- 30,dezembro 31