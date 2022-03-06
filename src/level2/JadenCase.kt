package level2

fun jadenCaseSolution(s: String): String {
    var answer = ""
    s.split(" ").forEach{it->
        if(it.isEmpty()){
            answer+=" "
        }else{
            answer+=it[0].toUpperCase()
            answer+=it.substring(1).toLowerCase()
            answer+=" "
        }
    }
    return answer.substring(0, answer.lastIndex)

}
fun main() {
    println(jadenCaseSolution("a  b  c"))
}