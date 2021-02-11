class Day7Part1 {

    var test = 0
    fun part1(input: String): Int {
        // Vi bryr oss inte om hur många shiny gold bags det finns
        return contains(input, "shiny gold bag")
    }

    private fun contains(input: String, bagColor: String): Int {
        // (?m) multiline, ^ början på raden, (\r?\n)? för att få bort raderna ordentligt
        val colorsContainingBagColor = findBagsContainingColor(input, bagColor)

        val left = input.replace("(?m)^.*$bagColor.*(\\r?\\n)?".toRegex(), "")
        if (colorsContainingBagColor.isEmpty()) {
            return test
        }
        test += colorsContainingBagColor.split("|").size
        contains(left, "($colorsContainingBagColor)")
        return test
    }

    private fun findBagsContainingColor(input: String, bagColor: String) =
        "(?m)^.*contain.*$bagColor.*".toRegex().findAll(input)
            .map {
                it.groupValues[0].split("s contain")[0]
            }.joinToString("|")

}