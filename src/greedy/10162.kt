package greedy

import java.util.*

fun main()= with(Scanner(System.`in`)){
    var A=0
    var B=0
    var C=0

    var T=nextInt()

    if(T%10!=0){
        print(-1)
        return
    }

    A=T/300
    T%=300

    B=T/60
    T%=60

    C=T/10

    print("$A $B $C")
}