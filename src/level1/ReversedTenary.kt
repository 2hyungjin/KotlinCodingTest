package level1

fun Int.toTernary():String{
    var n = this
    var answer=""
    do{
        answer += n % 3
        n/=3
    }while(n>0)
    return answer.reversed()
}

fun String.toDecimal():Int{
    var num = this.toInt()
    var answer=0
    var temp=1
    do{
        answer+=temp*(num%10)
        num/=10
        temp*=3
    }while(num>0)
    return answer
}
//내가 생각한 로직

fun solution(n: Int): Int {
    var answer: Int = 0
    answer=n.toString(3).reversed().toInt(3) //간단하게 풀기
    return answer
}