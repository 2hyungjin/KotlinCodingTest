package level2

fun makeBigNumberSolution(number: String, k: Int): String {
    var k=k
    val answer = StringBuilder(number)

    var index=0

    while(index<answer.lastIndex){
        if(answer[index].toInt()<answer[index+1].toInt()){
            answer.deleteCharAt(index)

            if(index>0)index--

            k--
        }else{
            index++
        }

        if(k==0)break;
    }
    answer.delete(answer.length-k,answer.length)


    return answer.toString()
}
fun main() {
    println(makeBigNumberSolution("1000",3))
}
