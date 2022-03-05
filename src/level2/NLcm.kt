package level2

fun check(array : IntArray, target : Int):Boolean{
    for(i in array){
        if(target%i != 0) return false
    }
    return true
}

fun nLcmSolution(arr: IntArray): Int {
    var array = arr.sortedByDescending{it}.toIntArray()
    var answer = array[0]

    while(!check(array,answer)){
        answer+=1
    }

    return answer
}
fun main() {
    println(nLcmSolution(intArrayOf(2,6,8,14)))
}