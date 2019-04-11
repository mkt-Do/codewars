package com.github.mktdo.codewars

import org.scalatest._
import org.scalatest.Assertions._

import PlayingWithDigitsTest._

class PlayingWithDigitsTest extends FlatSpec {
  it should "pass basic tests" in {
    testing(89, 1, 1)
    testing(92, 1, -1)
    testing(46288, 3, 51)

  }
}

object PlayingWithDigitsTest {

  private def testing(n: Int, p: Int, expect: Int): Unit = {
    println("Testing: " + n + ", " + p)
    val actual: Int = PlayingWithDigits.digPow(n, p)
    println("Actual: " + actual)
    println("Expect: " + expect)
    println("*")
    assertResult(expect){actual}
  }
}

