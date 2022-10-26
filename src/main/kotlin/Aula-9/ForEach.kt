package `Aula-9`

fun main() {
    var list: List<Int> = listOf(10, 11, 12)
    list += 13 // ou list = list +13
    /* cria uma nova lista e rejeita a variavel list
    list -> [10,11,12] é destruida
    e cria uma nova lista [10,11,12,13] -> depois da afetação é criada uma nova lista que junta a lista anterior a 13
     */
    list.forEach {
        println(it) // 10,11,12,13
    }
    list.forEachIndexed { idx: Int, elem: Int ->
        println("indice = $idx, elem = $elem") // elem == [10,11,12,13] e idx == [0,1,2,3]
    }
    // filter - devolve nova lista filtrada de acordo com a condição Booleana
    val lo: List<Int> = list.filter { it < 0 }
    println(lo) // [ ]
    val l1: List<Int> = list.filter { it % 2 == 0 }
    // it == parâmetro implicito (se existir e não for renomeado) -> indica o elemento corrente a ser interado na lista
    // map - transforma uma lista noutra
    // de acordo com a operação indicada
    println(l1)
    val l2 = list.map {
        println("elem = $it")
        it * 10 // retorno- indica a operação realizada
    }
    println(l2) // [100,110,120,130]
    //mapIndexed
    val l3 = l2.mapIndexed { index: Int, elem: Int ->
        println("indice= $index, elem = $elem")
        elem + index

    }
    println(l3)
}