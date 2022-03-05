package level2

fun checkDistance(array: Array<String>): Boolean {
    for (row in 0..4) {
        for (i in 0..4) {
            val line = array[row]

            if (line[i] == 'P') {
                if (i in 0..3) {
                    if (line[i + 1] == 'P') return false
                }
                if (i in 0..2) {
                    if (line[i + 2] == 'P' && line[i + 1] == 'O') return false
                }
                if (row in 0..3) {
                    val nextLine = array[row + 1]
                    if (nextLine[i] == 'P') return false

                    if (i in 0..3) {
                        if (nextLine[i + 1] == 'P') {
                            if (nextLine[i] == 'O' || line[i + 1] == 'O') return false
                        }
                    }
                    if (i in 1..4) {
                        if (nextLine[i - 1] == 'P') {
                            if (nextLine[i] == 'O' || line[i - 1] == 'O') return false
                        }
                    }
                }
                if (row in 0..2) {
                    if (array[row + 2][i] == 'P' && array[row + 1][i] == 'O') return false
                }

            }
        }
    }
    return true
}

fun checkDistanceSolution(places: Array<Array<String>>): IntArray {
    var answer: IntArray = intArrayOf()
    for (i in 0 until 5) {
        answer += if (checkDistance(places[i])) 1 else 0
    }
    return answer
}
