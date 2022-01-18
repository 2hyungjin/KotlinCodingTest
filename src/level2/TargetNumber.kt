package level2

fun targetNumberSolution(numbers: IntArray, target: Int): Int {
    var answer = 0

    fun calculate(sum:Int,isPlus:Boolean, index:Int){
        var sum = if(isPlus)sum+numbers[index] else sum-numbers[index]

        if(index==numbers.lastIndex){
            if(sum==target)answer++
            return
        }

        calculate(sum, true, index+1)
        calculate(sum, false,index+1)

    }
    calculate(0,false,0)
    calculate(0,true,0)
    return answer
}