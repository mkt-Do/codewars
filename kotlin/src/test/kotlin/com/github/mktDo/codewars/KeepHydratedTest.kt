package com.github.mktDo.codewars

import kotlin.test.assertEquals
import org.junit.Test

class KeepHydratedTest {
    @Test
    fun testFixed() {
        assertEquals(1, KeepHydrated.litres(2.0))
        assertEquals(0, KeepHydrated.litres(1.4))
        assertEquals(6, KeepHydrated.litres(12.3))
        assertEquals(0, KeepHydrated.litres(0.82))
        assertEquals(5, KeepHydrated.litres(11.8))
        assertEquals(893, KeepHydrated.litres(1787.0))
        assertEquals(0, KeepHydrated.litres(0.0))
    }
}
