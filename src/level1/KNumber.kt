package level1

fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
    var answer = mutableListOf<Int>()
    commands.forEach {
        val range = it[0]..it[1]
        val temp = array.filterIndexed { index, i ->
            index + 1 in range
        }.sorted()
        println(temp)
        answer.add(temp.get(it[2] - 1))
    }
    return answer.toIntArray()
}

fun main() {
    println(solution(intArrayOf(1, 5, 2, 6, 3, 7, 4),
        arrayOf(intArrayOf(2, 5, 3), intArrayOf(4, 4, 1), intArrayOf(1, 7, 3))))
}