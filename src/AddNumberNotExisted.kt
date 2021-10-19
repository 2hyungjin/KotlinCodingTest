fun solution(numbers: IntArray): Int {
    var answer: Int = 0
    val sum = numbers.sum()
    answer = 45 - sum
    return answer
}