package level2

fun openChattingSolution(record: Array<String>): Array<String> {
    var result = arrayListOf<Pair<String, String>>()
    val uidMap = mutableMapOf<String, String>()

    record.forEach { message ->
        val protocol = message.split(" ")

        val command = protocol[0]
        val uid = protocol[1]

        when (command) {
            "Enter" -> {
                val name = protocol[2]
                uidMap.put(uid, name)
                result.add(uid to "님이 들어왔습니다.")
            }
            "Leave" -> result.add(uid to "님이 나갔습니다.")
            "Change" -> {
                val name = protocol[2]
                uidMap.put(uid, name)
            }
        }
    }
    return result.map {
        "${uidMap[it.first]}${it.second}"
    }.toTypedArray()
}
