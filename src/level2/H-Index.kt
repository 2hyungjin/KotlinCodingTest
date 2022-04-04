package level2

fun solution(citations: IntArray): Int {
    val max = citations.maxByOrNull { it }
    for (i in max!! downTo 0) {
        if (citations.count { it >= i } >= i) return i
    }
    return 0
}
