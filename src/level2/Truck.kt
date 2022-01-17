package level2

fun truckSolution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
    var answer = 0

    val bridge = mutableListOf<Int>()
    for (i in 0 until bridge_length) bridge.add(0)

    val truck = truck_weights.toMutableList()

    while (bridge.isNotEmpty()) {
        bridge.removeAt(0)
        if (truck.isNotEmpty()) {
            if (bridge.sum() + truck[0] <= weight) {
                bridge.add(truck[0])
                truck.removeAt(0)
            } else bridge.add(0)
        }

        answer++
    }
    return answer

}