/*const val earliestDeparture = 1002561
var buses =
    listOf(17,null,null,null,null,null,null,null,null,null,null,37,null,null,null,null,null,409,null,29,null,null,null,null,null,null,null,null,null,null,13,null,null,null,null,null,null,null,null,null,23,null,null,null,null,null,null,null,373,null,null,null,null,null,null,null,null,null,41,null,null,null,null,null,null,null,null,19)
*/
const val earliestDeparture = 939
var buses = listOf(7,13,null,null,59,null,31,19)
fun main() {
    val earliestBus = getEarliestBus(earliestDeparture, buses)
    println(earliestBus.id * earliestBus.departsIn)
}


fun getEarliestBus(earliestDeparture: Int, buses: List<Int?>): Bus {
    var earliestBusYet = Bus(0, 100000000)
    buses
        .filterNotNull()
        .forEach { bus ->
            val departsIn = bus - earliestDeparture % bus

            if (departsIn < earliestBusYet.departsIn) {
                earliestBusYet = Bus(bus, departsIn)
            }
        }
    return earliestBusYet
}

data class Bus(val id: Int, val departsIn: Int)