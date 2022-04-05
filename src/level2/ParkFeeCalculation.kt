package level2

fun String.getMinute():Int{
    val hour = this.split(":")[0].toInt()
    val minute = this.split(":")[1].toInt()

    return hour*60 + minute
}

fun parkFeeCalculate(fees: IntArray, records: Array<String>): IntArray {
    val answer=mutableListOf<Int>()
    val baseTime = fees[0]
    val baseFee = fees[1]
    val extraTime = fees[2]
    val extraFee = fees[3]

    var history  = mutableMapOf<String, MutableList<Int>>()
    records.forEach{ s->
        val record = s.split(" ")

        val time = record[0]
        val number = record[1]

        if(history[number]==null){
            history.put(number, mutableListOf<Int>())
        }
        history[number]?.add(time.getMinute())


    }
    history.toList().sortedBy{it.first}.forEach{
        var fee=0
        var time=0
        for(i in it.second.indices){
            if(i+1 <= it.second.lastIndex){
                if(i%2==0)time+=it.second[i+1] - it.second[i]
            }else if(i == it.second.lastIndex && it.second.size%2!=0){
                time+="23:59".getMinute() - it.second[i]
            }
        }
        if(time > baseTime)
        {
            var restTime=(time-baseTime)/extraTime
            if((time-baseTime)%extraTime!=0)restTime+=1

            fee+=restTime*extraFee
        }
        System.out.println("$time $fee")
        fee+=baseFee
        answer.add(fee)
    }


    return answer.toIntArray()
}