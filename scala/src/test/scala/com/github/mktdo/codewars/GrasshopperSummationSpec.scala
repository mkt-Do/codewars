package com.github.mktdo.codewars

import org.scalatest._

class GrasshopperSummationSpec extends FlatSpec with Matchers {

  "summation(1)" should "return 1" in {
    GrasshopperSummation.summation(1) should be (1)
  }
  "summation(8)" should "return 36" in {
    GrasshopperSummation.summation(8) should be (36)
  }
}
