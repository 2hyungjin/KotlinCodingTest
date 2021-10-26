package level1

class Solution {
    var maxX = 0
        set(value) {
            if (value > field) field = value
        }

    var maxY = 0
        set(value) {
            if (value > field) field = value
        }

    fun solution(sizes: Array<IntArray>): Int {


        sizes.forEach { size ->
            maxX = size.maxOrNull()!!
            maxY = size.minOrNull()!!
        }
        return maxX * maxY
    }
}