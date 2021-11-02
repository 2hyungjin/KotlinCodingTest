package level1

fun makeStrangeString(s:String): String {
    var answer=""
    var i=0
    for(c in s){
        if(i%2==0)answer+=c.toUpperCase()
        else answer+=c.toLowerCase()

        i++

        if(c==' ')i=0
    }
    return answer
}
}