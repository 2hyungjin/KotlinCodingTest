package level2

fun develop(progresses: IntArray, speeds: IntArray): IntArray {
    var answer = arrayListOf<Int>()
    var days = arrayListOf<Int>()

    for (i in 0..progresses.lastIndex) {
        var last = (100 - progresses[i]) / speeds[i]
        if ((100 - progresses[i]) % speeds[i] != 0) last++
        days.add(last)
    }
    while (!days.isEmpty()) {
        var count = 0
        var done = days[0]

        days.removeAt(0)
        count++

        while (!days.isEmpty() && days[0] <= done) {
            days.removeAt(0)
            count++
        }
        answer.add(count)
    }
    return answer.toIntArray()
}

fun main() {
    println(develop(intArrayOf(96, 94), intArrayOf(3, 3)).contentToString())
}