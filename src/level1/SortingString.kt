package level1


fun solution(s: String): String = s.toCharArray().sortedDescending().toString()
fun main() {
    println(solution("Zbcdefg"))
}

