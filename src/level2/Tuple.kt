package level2

fun tupleSolution(s: String): IntArray {
    val count = mutableMapOf<Int, Int>()
    var numbers=s.replace("{", "")
    numbers=numbers.replace("}", "")

    numbers.split(",").forEach { it ->
        if (count.contains(it.toInt())) {
            count[it.toInt()] = count.getValue(it.toInt()) + 1
        } else {
            count[it.toInt()] = 0
        }
    }

    return count.toList().sortedByDescending { it.second }.map { it.first }.toIntArray()
}
fun main() {
    println(    tupleSolution("{{2},{2,1},{2,1,3},{2,1,3,4}}"	).contentToString())
}