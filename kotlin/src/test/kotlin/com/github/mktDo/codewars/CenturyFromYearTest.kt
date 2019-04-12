package com.github.mktDo.codewars

import org.junit.Test
import kotlin.test.assertEquals
import java.util.Random

class CenturyFromYearTest {

    @Test
    fun testFixed() {
        assertEquals(18, CenturyFromYear.century(1705));
        assertEquals(19, CenturyFromYear.century(1900));
        assertEquals(17, CenturyFromYear.century(1601));
        assertEquals(20, CenturyFromYear.century(2000));
        assertEquals(1,  CenturyFromYear.century(89));
    }
}
