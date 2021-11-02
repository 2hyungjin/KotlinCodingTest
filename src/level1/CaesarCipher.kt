package level1

fun getCaesarCipher(s: String, n: Int): String {
    val lowerCase = "abcdefghijklmnopqrstuvwxyz".toCharArray()
    val upperCase = "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray()

    var answer = charArrayOf()

    for (c in s) {

        if (c in 'A'..'Z') {
            val index = (upperCase.indexOf(c) + n) % upperCase.size
            answer += upperCase[index]
        } else if (c in 'a'..'z') {
            val index = (lowerCase.indexOf(c) + n) % lowerCase.size
            answer += lowerCase[index]
        } else {
            answer += ' '
        }
    }
    return String(answer)
}