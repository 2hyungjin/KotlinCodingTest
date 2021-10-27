package level1

fun getDivisibleArray(arr: IntArray, divisor: Int): IntArray {
    return arr.filter { it % divisor == 0 }.sorted().toMutableList().apply { if (this.size == 0) add(-1) }.toIntArray()
}
