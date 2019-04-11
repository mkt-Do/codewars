package com.github.mktdo.codewars

import org.scalatest._

class TransportationOnVacationTest extends FlatSpec with Matchers {

  val tests = List(
    (1,  40),
    (4, 140),
    (7, 230),
    (8, 270)
  )

  tests.foreach {
    case (input, expected) =>
      s"format($input)" should s"return $expected" in {
        TransportationOnVacation.cost(input) should be (expected)
      }
  }
}
