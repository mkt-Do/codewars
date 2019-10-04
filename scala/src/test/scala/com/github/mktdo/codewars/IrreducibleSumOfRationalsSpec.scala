package com.github.mktdo.codewars

import org.scalatest._
import org.scalatest.Assertions._

import IrreducibleSumOfRationalsSpec._

class IrreducibleSumOfRationalsSpec extends FlatSpec { 
  it should "pass basic tests" in {
    var lst: Array[(Long, Long)]  = Array((1L, 2L), (1L, 3L), (1L, 4L))
    testing(lst, "[13, 12]")
    var a = Array((1L,2L), (2L,9L), (3L,18L), (4L,24L), (6L,48L))
    testing(a, "[85, 72]")  
    a = Array()
    testing(a, "0")

  }
}

object IrreducibleSumOfRationalsSpec {

  private def ArrayTupleToString(res: Array[(Long, Long)]): String = {
    var s: String = "["
    val l: Int = res.size
    for (i <- 0 until l) {
      val a = res(i)
      s += "(" + a._1 + ", " + a._2
      if (i < l - 1) s += "), " else s += ")"
    }
    s += "]"
    return s
  }

  private def testing(lst: Array[(Long, Long)], expect: String): Unit = {
    println("Testing: " + ArrayTupleToString(lst))
    val actual: String = IrreducibleSumOfRationals.sumFracts(lst)
    println("Actual: " + actual)
    println("Expect: " + expect)
    println("-")
    assertResult(expect){actual}
  }
}
