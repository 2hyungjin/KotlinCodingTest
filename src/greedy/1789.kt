package greedy

import java.util.*

fun main()=with(Scanner(System.`in`)){
    var s=nextInt()

    var i=1
    var answer=0
    while(s>i){
        s-=i
        i++
        answer++
    }
    print(answer)
}