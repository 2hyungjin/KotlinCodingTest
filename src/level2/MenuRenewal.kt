package level2

val menuMap = mutableMapOf<String, Int>()

fun addCourse(rest: String, sum: String) {
    if(menuMap.contains(sum)){
        menuMap[sum]=menuMap[sum]!!+1
    }else{
        menuMap.put(sum,1)
    }

    for(i in 0..rest.lastIndex){
        addCourse(rest.removeRange(i, i+1), sum + rest[i])
    }
}

fun menuRenewal(orders: Array<String>, course: IntArray): Array<String> {
    val answer=mutableListOf<String>()

    for (s in orders) {
        addCourse(s.toCharArray().sorted().joinToString(""), "")
    }

    for (i in course) {
        val dish = menuMap.toList().filter{it.first.length == i}.sortedByDescending { it.second }
        println(dish+"\n\n")
        answer.addAll(dish.filter{ it.second == dish[0].second}.map{it.first})
    }



    return answer.toTypedArray()
}
fun main() {
    println(menuRenewal(arrayOf("ABCFG","AC","CDE","ACDE","BCFG","ACDEH"), intArrayOf(2,3,4)))
}