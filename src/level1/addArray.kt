package level1

fun addArray(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    var answer = Array(arr1.size) { i -> IntArray(arr1[i].size) }
    for (arr in arr1.indices) {
        for (i in arr1[arr].indices) {
            answer[arr][i] = arr1[arr][i] + arr2[arr][i]
        }
    }
    return answer
}
