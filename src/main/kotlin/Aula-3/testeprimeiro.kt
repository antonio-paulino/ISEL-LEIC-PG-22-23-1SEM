fun main() {
print("Digite um ano: ")
val ano = readLine()!!.toInt()

if ((ano % 4 == 0) && (ano % 400 == 0) || (ano % 100 != 0) )
    print("${ano} é ano bissexto.")
else
    print("${ano} NÃO é ano bissexto.")
}
