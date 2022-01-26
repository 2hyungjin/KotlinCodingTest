package greedy

import java.util.*

fun main()=with(Scanner(System.`in`)){
    val n = nextInt()
    val weights=mutableListOf<Int>()

    for(i in 1..n){
        weights.add(nextInt())
    }
    weights.sort()
}