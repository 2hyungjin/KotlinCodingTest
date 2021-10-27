package level1

fun getLackedMoney(price: Int, money: Int, count: Int): Long {
    var sum=0L
    for(i in 1..count){
        sum+=price*i
    }
    val answer =sum-money
    return if(answer<=0)0L else answer.toLong()
}
fun main() {
    println(getLackedMoney(2,1,1))
}