package codingtest

fun solution(a: IntArray, b: IntArray): Int {
    var answer: Int = 0
    for (i in 0..a.lastIndex) {
        answer += a[i] * b[i]
    }
    return answer
}

fun main(args: Array<String>) {
    println(solution(intArrayOf(-1,0,1), intArrayOf(1,0,-1)))
}