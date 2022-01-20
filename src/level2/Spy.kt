package level2

fun spySolution(clothes: Array<Array<String>>): Int {
    var answer = 1
    var clothes = clothes.groupBy{it[1]}

    for(element in clothes){
        answer *= element.value.size+1
    }

    return answer-1
}