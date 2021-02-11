import org.junit.Assert
import org.junit.Test
import java.io.File


class Day7Test {

    @Test
    fun `Testar att vi får ut exempel output`() {
        val input = "light red bags contain 1 bright white bag, 2 muted yellow bags.\n" +
                "dark orange bags contain 3 bright white bags, 4 muted yellow bags.\n" +
                "bright white bags contain 1 shiny gold bag.\n" +
                "muted yellow bags contain 2 shiny gold bags, 9 faded blue bags.\n" +
                "shiny gold bags contain 1 dark olive bag, 2 vibrant plum bags.\n" +
                "dark olive bags contain 3 faded blue bags, 4 dotted black bags.\n" +
                "vibrant plum bags contain 5 faded blue bags, 6 dotted black bags.\n" +
                "faded blue bags contain no other bags.\n" +
                "dotted black bags contain no other bags."
        Assert.assertEquals(4, Day7Part1().part1(input))
    }

    @Test
    fun `Testar att vi får ut riktiga output`() {
        val input = File("src/main/resources/Day7Part1").readText()
        Assert.assertEquals(148, Day7Part1().part1(input))
    }

}