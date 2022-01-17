package level2

fun printer(priorities: IntArray, location: Int): Int {
    var answer = 0
    val printer=priorities.mapIndexed{loc,pos -> loc to pos}.toMutableList()
    var flag=true
    while(flag){
        val target= printer[0]
        if(printer.all{target.second>=it.second}){
            answer++

            if(target.first==location) flag=false

            printer.remove(target)

        } else{
            printer.remove(target)
            printer.add(target)
        }
    }

    return answer
}

