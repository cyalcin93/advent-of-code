
class Day15 {

    fun part1(vararg input: Int): Int {
        return resolve(2020, *input)
    }

    fun part2(vararg input: Int): Int {
        return resolve(30000000, *input)
    }

    private fun resolve(turns: Int, vararg input: Int): Int {
        var memMap: MutableMap<Int, Int> = mutableMapOf()
        input.forEachIndexed { index, num -> memMap.putIfAbsent(num, index + 1) }
        var next = input.last()

        for (turn in input.size until turns) {
            val nextNum = getNextNumber(memMap, turn, next)
            memMap[next] = turn
            next = nextNum
        }

        return next
    }

    private fun getNextNumber(memMap: MutableMap<Int, Int>, turn: Int, number: Int)
        = if (!memMap.containsKey(number)) 0 else turn - memMap[number]!!
}