package com.github.mktdo.codewars

import org.scalatest._
import org.scalatest.Assertions._
import RuleOfDivisibilityBy13Test._

class RuleOfDivisibilityBy13Test extends FlatSpec {
  it should "pass basic tests" in {
    dotest(8529, 79)
    dotest(85299258, 31)
    dotest(5634, 57)
    dotest(1111111111, 71)

  }
}

object RuleOfDivisibilityBy13Test {
  private def dotest(n: Long, expect: Long): Unit = {
    println("Testing: " + n)
    val actual: Long = RuleOfDivisibilityBy13.thirt(n)
    assertResult(expect){actual}
  }
}
