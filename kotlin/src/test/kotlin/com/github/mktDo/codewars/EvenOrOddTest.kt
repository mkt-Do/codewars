package com.github.mktDo.codewars

import kotlin.test.assertEquals
import org.junit.Test

class EvenOrOddTest {
  @Test
  fun testFixed() {
    assertEquals("Even", EvenOrOdd.evenOrOdd(2))
    assertEquals("Even", EvenOrOdd.evenOrOdd(0))
    assertEquals("Odd", EvenOrOdd.evenOrOdd(7))
    assertEquals("Odd", EvenOrOdd.evenOrOdd(1))
  }
}
