package level1

fun removeMin(arr: IntArray): IntArray {
    val answer=arr.filter{it!= arr.minOrNull() }.toIntArray()
    return if(answer.isEmpty())intArrayOf(-1) else answer
}
