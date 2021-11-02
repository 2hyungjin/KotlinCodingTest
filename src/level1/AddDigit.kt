package level1

fun addDigit(n: Int): Int {
    var answer = 0
    n.toString().map { answer += it.digitToInt() }
    return answer
}