package level2

val answerSet = mutableSetOf<Int>()
fun Int.isPrime(): Boolean {
    if (this == 1 || this == 0) return false
    for (i in 2..this / 2) {
        if (this % i == 0) return false
    }
    return true
}

fun makeNumber(s: String, sum: String) {
    if (sum.isNotEmpty()) {
        if (sum.toInt().isPrime()) {
            answerSet.add(sum.toInt())
        }
    }
    for (i in 0..s.lastIndex) {
        makeNumber(s.removeRange(i, i + 1), sum + s.substring(i, i + 1))
    }
}

fun findPrimeNumberSolution(numbers: String): Int {
    makeNumber(numbers, "")
    return answerSet.size
}