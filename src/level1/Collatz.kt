package level1

fun isEven(num: Long) = num % 2L == 0L

fun getCollatz(num: Int): Int {
    var num = num.toLong()
    var answer = 0
    while (num != 1L) {
        if (isEven(num)) num /= 2
        else num = num * 3 + 1
        answer++

        if (answer > 500) return -1
    }
    return answer
}