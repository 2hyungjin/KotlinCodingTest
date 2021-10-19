package codingtest

data class NumPad(var location: Pair<Int, Int>) {
    operator fun minus(other: NumPad): Int {
        val xRange = (location.first - other.location.first).let {
            if (it < 0) it * -1 else it
        }
        val yRange = (location.second - other.location.second).let {
            if (it < 0) it * -1 else it

        }
        return xRange + yRange
    }
}

enum class Direction { L, R }
data class Hand(val direction: Direction, var location: NumPad)

fun solution(numbers: IntArray, hand: String): String {
    val builder = StringBuilder()

    fun Hand.changeLocate(location: NumPad) {
        builder.append(this.direction.name)
        this.location = location
    }

    val leftNumpads = mapOf<Int, NumPad>(1 to NumPad(0 to 0), 4 to NumPad(1 to 0), 7 to NumPad(2 to 0))
    val middleNumpads =
        mapOf<Int, NumPad>(2 to NumPad(0 to 1), 5 to NumPad(1 to 1), 8 to NumPad(2 to 1), 0 to NumPad(3 to 1))
    val rightNumpads = mapOf<Int, NumPad>(3 to NumPad(0 to 2), 6 to NumPad(1 to 2), 9 to NumPad(2 to 2))

    val leftHand = Hand(Direction.L, NumPad(3 to 0))
    val rightHand = Hand(Direction.R, NumPad(3 to 2))
    val majorHand = if (hand == "left") leftHand else rightHand

    numbers.forEach { num ->
        val leftNumPad = leftNumpads[num]
        val rightNumPad = rightNumpads[num]
        val middleNumPad = middleNumpads[num]

        leftNumPad?.let {
            leftHand.changeLocate(it)
        }
        rightNumPad?.let {
            rightHand.changeLocate(it)
        }
        middleNumPad?.let {
            val rightRange = middleNumPad - rightHand.location
            val leftRange = middleNumPad - leftHand.location
            when (rightRange.compareTo(leftRange)) {
                -1 -> rightHand.changeLocate(it)
                1 -> leftHand.changeLocate(it)
                else -> majorHand.changeLocate(it)
            }
        }
    }
    return builder.toString()
}

fun main() {
    println(solution(intArrayOf(1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5), "right"))
}