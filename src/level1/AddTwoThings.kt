package level1

fun addTwoThings(numbers: IntArray): IntArray {
    var answer: IntArray = intArrayOf()
    numbers.forEachIndexed{index, num->
        for(i in index+1..numbers.lastIndex){
            val sum= numbers[i]+num
            if(!answer.contains(sum))answer+=sum
        }
    }
    return answer.sorted().toIntArray()
}