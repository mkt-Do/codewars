package com.github.mktdo.codewars

import org.scalatest._
import org.scalatest.Assertions._

import CheckchooseSpec._

class CheckchooseSpec extends FlatSpec {
  it should "pass basic tests" in {
    dotest(6, 4, 2)
    dotest(4, 4, 1)
    dotest(4, 2, -1)
    dotest(35, 7, 3)

  }
}

object CheckchooseSpec {

  private def dotest(m: Long, n: Int, expect: Long): Unit = {
    println("Testing: " + m + ", " + n )
    val actual: Long = ColorChoice.checkchoose(m, n)
    println("Actual: " + actual)
    println("Expect: " + expect)
    println("*")
    assertResult(expect){actual}
  }
}
