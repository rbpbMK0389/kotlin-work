// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {

    @Test
    fun `Mark of 55 gives a Pass`() {
        assertEquals("Pass", grade(55)) //arrgance, act, assert all together 
    }

    @Test
    fun `mark of -1 gives qnm`() {
        assertEquals("?", grade(-1))
    }

    @Test
    fun `mark of 0 gives Fail`() {
        assertEquals("Fail", grade(0))
    }

    @Test
    fun `mark of 25 gives Fail`() {
        assertEquals("Fail", grade(25))
    }

    @Test
    fun `mark of 39 gives Fail`() {
        assertEquals("Fail", grade(39))
    }

    @Test
    fun `mark of 40 gives Pass`() {
        assertEquals("Pass", grade(40))
    }

    @Test
    fun `mark of 60 gives Pass`() {
        assertEquals("Pass", grade(60))
    }

    @Test
    fun `mark of 69 gives Pass`() {
        assertEquals("Pass", grade(69))
    }

    @Test
    fun `mark of 70 gives Distinction`() {
        assertEquals("Distinction", grade(70))
    }

    @Test
    fun `mark of 85 gives Distinction`() {
        assertEquals("Distinction", grade(85))
    }

    @Test
    fun `mark of 100 gives Distinction`() {
        assertEquals("Distinction", grade(100))
    }

    @Test
    fun `mark of 101 gives qnm`() {
        assertEquals("?", grade(101))
    }

}

