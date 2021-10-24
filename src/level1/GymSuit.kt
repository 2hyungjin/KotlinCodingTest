package level1

fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
    val lostList = lost.toMutableList()
    val reserveList = reserve.filter {
        if (lost.contains(it)) {
            lostList.remove(it)
            false
        } else true
    }.sorted().toMutableList()
    val noSuitList = lostList.sorted().filter {
        if (reserveList.contains(it - 1)) {
            reserveList.remove(it - 1)
            false
        } else if (reserveList.contains(it + 1)) {
            reserveList.remove(it + 1)
            false
        } else true
    }
    return n - noSuitList.size
}

fun main() {
    println(solution(5, intArrayOf(2, 4), intArrayOf(1, 3, 5)))
}