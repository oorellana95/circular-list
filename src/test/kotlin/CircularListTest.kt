import kotlin.test.assertFailsWith
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class CircularListTest {
    @Test
    fun givenCircularListOfStringsWhenCallingNextFunctionThenWorksAsExpected() {
        val xs = CircularList("one", "two", "three")
        assertEquals(xs.next(), "one")
        assertEquals(xs.next(), "two")
        assertEquals(xs.next(), "three")
        assertEquals(xs.next(), "one")
    }

    @Test
    fun givenCircularListOfIntegersWhenCallingPreviousFunctionThenWorksAsExpected() {
        val ys = CircularList(1, 2, 3, 4, 5)
        assertEquals(ys.prev(), 5)
        assertEquals(ys.prev(), 4)
        assertEquals(ys.prev(), 3)
        assertEquals(ys.prev(), 2)
        assertEquals(ys.prev(), 1)
        assertEquals(ys.prev(), 5)
    }

    @Test
    fun givenAnEmptyListWhenInitializeCircularListThenItShouldThrowException() {
        assertFailsWith<Exception> { CircularList<Int>() }
    }
}