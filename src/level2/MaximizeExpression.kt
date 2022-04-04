import kotlin.math.*

var max = Long.MIN_VALUE

fun calculate(numbers: MutableList<Long>, operands: MutableList<Char>, priority: String) {
    priority.map { p ->
        var time=0
        while (true){
            val i=operands.indexOf(p)
            if (i==-1)break

            numbers[i] = when (operands[i]) {
                '+' -> numbers[i] + numbers[i + 1]
                '-' -> numbers[i] - numbers[i + 1]
                '*' -> numbers[i] * numbers[i + 1]
                else -> 0
            }
            numbers.removeAt(i+1)
            operands.removeAt(i)
        }
    }
    numbers[0] = numbers[0].absoluteValue
    System.out.println(numbers[0])
    if (max < numbers[0]) max = numbers[0].toLong()
}

fun maximizeExpression(expression: String): Long {
    val priorities=listOf<String>("*+-","*-+","+-*","+*-","-*+","-+*")
    for(i in priorities){
        val numbers=expression.split("+", "-", "*").map{it.toLong()}.toMutableList()
        val operands=expression.replace("[0-9]".toRegex()," ").filter{ it !=' '}.toMutableList()
        calculate(numbers, operands.toMutableList(), i)
    }

    return max
}
fun main() {
    println(maximizeExpression("100-200*300-500+20"))
}
