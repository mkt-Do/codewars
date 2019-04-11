package com.github.mktdo.codewars

import org.scalatest._
import org.scalatest.Assertions._

import ProductOfConsecutiveFibNumbersTest._

class ProductOfConsecutiveFibNumbersTest extends FlatSpec {
  it should "pass basic tests" in {
    dotest(4895L, Array(55, 89, 1))
    dotest(5895L, Array(89, 144, 0))
    dotest(74049690L, Array(6765, 10946, 1))

  }
}

object ProductOfConsecutiveFibNumbersTest {

  private def dotest(prod: Long, expect: Array[Long]): Unit = {
    println("Testing: " + prod)
    val actual: Array[Long] = ProductOfConsecutiveFibNumbers.productFib(prod)
    println("Actual: " + actual.mkString(", "))
    println("Expect: " + expect.mkString(", "))
    println("-")
    assertResult(expect){actual}
  }
}


