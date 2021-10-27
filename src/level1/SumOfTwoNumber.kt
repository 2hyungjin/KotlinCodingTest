package level1

fun getSum(a: Int, b: Int): Long {
    var answer: Long = 0

    for(i in minOf(a,b)..maxOf(a,b))answer+=i.toLong()
    return answer
}