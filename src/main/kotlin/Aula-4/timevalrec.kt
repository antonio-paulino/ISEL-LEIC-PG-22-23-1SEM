fun main () {
    print("Hours: ")
    var h = readln().toInt()
    print("Minuts: ")
    var m = readln().toInt()
    print("Seconds: ")
    var s = readln().toInt()

    if (s/60>0) {
        m += s/60
        s -= (s/60)*60
    }

    if (m/60>0) {
        h += m/60
        m -= (m/60)*60
    }

    println("$h hours $m minutes $s seconds")
}