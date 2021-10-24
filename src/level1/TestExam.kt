package level1


fun solution(answers: IntArray): IntArray {
    val firstAnswers = intArrayOf(1,2,3,4,5)
    val secondAnswers = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
    val thirdAnswers = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

    val scoreList = intArrayOf(0, 0, 0)

    fun checkAnswer(answers: IntArray, problemNumber: Int, answer: Int): Boolean {
        return answers[problemNumber % (answers.size)] == answer
    }

    answers.forEachIndexed { index, answer ->
        if (checkAnswer(firstAnswers, index, answer)) scoreList[0]++
        if (checkAnswer(secondAnswers, index, answer)) scoreList[1]++
        if (checkAnswer(thirdAnswers, index, answer)) scoreList[2]++
    }

    return scoreList.filter { it == scoreList.maxOrNull() }.mapIndexed { index, _ -> index + 1 }.sorted().toIntArray()
}

fun main() {
    solution(intArrayOf(1, 3, 3, 4, 5)).forEach {
        println(it)
    }
}