package com.github.mktDo.codewars

import org.junit.Assert.*
import org.junit.Test

class SumOfPositiveTest {
    @Test
    fun testSomething() {
        assertEquals(15, SumOfPositive.sum(intArrayOf(1, 2, 3, 4, 5)))
        assertEquals(13, SumOfPositive.sum(intArrayOf(1, -2, 3, 4, 5)))
        assertEquals(0, SumOfPositive.sum(intArrayOf()))
        assertEquals(0, SumOfPositive.sum(intArrayOf(-1, -2, -3, -4, -5)))
        assertEquals(9, SumOfPositive.sum(intArrayOf(-1, 2, 3, 4, -5)))
    }
}
