package level1

fun reverseNumber(n: Long): IntArray {
    return n.toString().reversed().map { it.digitToInt() }.toIntArray()
}