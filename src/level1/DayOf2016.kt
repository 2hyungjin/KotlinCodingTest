package level1

fun getDay(a: Int, b: Int): String {
    val dateList = listOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    val dayList = listOf("THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED")

    val leftedDay = dateList.filterIndexed { index, _ -> index + 1 < a }.sum() + b

    val day = dayList[leftedDay % 7]

    return day
}

fun main() {
    println(getDay(5, 24))
}