package `Aula-7`

fun main() {
    val list: List<Int> = listOf(10, 11, 12)
    println(list)
    println(list[0])
    println(list[1])
    println(list[2])
    println(list.size)
    println(list.first())
    println(list.last())
    //  println(list.firstIndex())
    println(list.lastIndex)

    list.forEach {
        println(it)
    }
    //adicionar +1
    //a todos os elementos
    //da lista, produzindo
    //uma nova lista
    val newList: List<Int> = list.map {
        it + 1
    }
    println(newList)
    println(list)
}