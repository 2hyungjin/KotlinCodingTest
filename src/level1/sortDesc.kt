package level1

fun sortDesc(n: Long): Long {
    var answer=""
    n.toString().map { it.toString().toInt() }.sortedDescending().toIntArray().map { answer+=it.toString() }
    return answer.toLong()

}
