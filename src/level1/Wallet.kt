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
            val x = size[0]
            val y = size[1]

            maxX = if (x > y) x else y
            maxY = if (x < y) x else y
        }
        return maxX * maxY
    }
}