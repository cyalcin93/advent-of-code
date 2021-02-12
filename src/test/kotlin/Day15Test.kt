import org.junit.Assert
import org.junit.Test

class Day15Test {
    @Test
    fun `Testar att vi får ut exempel output`() {
        Assert.assertEquals(436, Day15().part1(0,3,6))
    }

    @Test
    fun `Testar att vi får ut alla andra exempel output`() {
        Assert.assertEquals(1, Day15().part1(1,3,2))
        Assert.assertEquals(10, Day15().part1(2,1,3))
        Assert.assertEquals(27, Day15().part1(1,2,3))
        Assert.assertEquals(78, Day15().part1(2,3,1))
        Assert.assertEquals(438, Day15().part1(3,2,1))
        Assert.assertEquals(1836, Day15().part1(3,1,2))
    }

    @Test
    fun `Testar att mitt eget puzzle output är rätt`() {
        Assert.assertEquals(1618, Day15().part1(0,13,1,8,6,15))
    }

    @Test
    fun `Testar part2 exempel output`() {
        Assert.assertEquals(175594, Day15().part2(0,3,6))
        Assert.assertEquals(2578, Day15().part2(1,3,2))
        Assert.assertEquals(3544142, Day15().part2(2,1,3))
        Assert.assertEquals(261214, Day15().part2(1,2,3))
        Assert.assertEquals(6895259, Day15().part2(2,3,1))
        Assert.assertEquals(18, Day15().part2(3,2,1))
        Assert.assertEquals(362, Day15().part2(3,1,2))
    }

    @Test
    fun `Testar att mitt eget puzzle output är rätt för part2`() {
        Assert.assertEquals(548531, Day15().part2(0,13,1,8,6,15))
    }
}