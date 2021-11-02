package level1

fun isCorrect(s: String) = (s.length == 4 || s.length == 6) && !(s.any { it in 'a'..'Z' })
