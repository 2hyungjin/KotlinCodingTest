package level2

var answer = IntArray(2){0}
fun check(brown:Int, height:Int, width:Int){
    if(brown== 2*height + 2*width + 4){
        answer[0]=height+2
        answer[1]=width+2
    }
}

fun carpetSolution(brown: Int, yellow: Int): IntArray {
    for(i in 1..yellow/2+1){
        if(yellow%i==0)
            check(brown,i,yellow/i)
    }
    return answer
}
