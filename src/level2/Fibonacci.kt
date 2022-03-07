package level2

fun fibonacciSolution(n: Int): Int {
    val fibos=IntArray(n+1){it}
    for(i in 2..fibos.lastIndex){
        fibos[i]=(fibos[i-1]+fibos[i-2])%1234567
    }
    return fibos[n]
}