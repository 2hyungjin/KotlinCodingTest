package level1

fun getRestIsOne(n: Int): Int {
    var answer: Int = 0
    for (i in 1..n - 1) {
        if (n % i == 1) return i
    }
    return n - 1
}