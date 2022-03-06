package level2

var min = Integer.MAX_VALUE

fun zip(s: String, count: Int) {
    var s = s
    var newS = ""

    var n = 1
    var temp = ""

    while (s.length >= count) {
        var part = s.substring(0, count)
        s = s.substring(count)

        if (part == temp) {
            n++
        } else {
            newS += joinString(n, temp)
            n = 1
        }
        temp = part
    }
    newS += joinString(n, temp)
    newS += s

    min = if (min > newS.length) newS.length else min
}

fun joinString(n: Int, s: String) = if (n == 1) s else "$n$s"

fun zipStringSolution(s: String): Int {
    for (i in 1..s.length / 2  +1 ) zip(s, i)
    return min
}
fun main() {
    println(zipStringSolution("a"))
}