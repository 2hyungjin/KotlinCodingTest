package greedy

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    var min = Int.MIN_VALUE
    var max = Int.MIN_VALUE
    for (i in 0..1) {
        val input = nextInt()

        min += input.toString()
            .fold(0) { acc, c -> acc * 10 + if (c.toString().toInt() == 6) 5 else c.toString().toInt() }
        max += input.toString()
            .fold(0) { acc, c -> acc * 10 + if (c.toString().toInt() == 5) 6 else c.toString().toInt() }
    }
    print("$min $max")
}