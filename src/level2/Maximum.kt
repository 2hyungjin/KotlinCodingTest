package level2

fun maximumSolution(numbers: IntArray): String {
    return numbers.sortedWith(Comparator { a, b -> "$a$b".compareTo("$b$a") }).reversed().joinToString("")
        .let { if (it.startsWith("0")) "0" else it }
}

fun main() {
    println(maximumSolution(intArrayOf(6, 10, 2)))
}