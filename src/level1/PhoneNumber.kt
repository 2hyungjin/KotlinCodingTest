package level1

fun hidePhoneNumber(phone_number: String) =
    phone_number.reversed().mapIndexed { index, c -> if (index < 4) c else '*' }.reversed().toCharArray()
