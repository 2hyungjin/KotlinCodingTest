package level1.level1


fun solution(absolutes: IntArray, signs: BooleanArray): Int {
    var answer: Int = 0
    absolutes.forEachIndexed { index, num ->
        answer += if (signs[index]) num else -num
    }
    return answer
}
fun main() {
    println(solution(intArrayOf(4, 7, 12), booleanArrayOf(true, false, true)))
}