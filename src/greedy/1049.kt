package greedy

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    val m = nextInt()

    var packMin = Int.MAX_VALUE
    var oneMin = Int.MAX_VALUE

    for (i in 0 until m) {
        val pack = nextInt()
        val one = nextInt()

        if (pack < packMin) packMin = pack
        if (one < oneMin) oneMin = one
    }
    val case1 = (n / 6 * packMin) + (n % 6 * oneMin)
    val case2 = n * oneMin
    val case3 = (n / 6 * packMin)+packMin


    print(minOf(case1,case2,case3))

}