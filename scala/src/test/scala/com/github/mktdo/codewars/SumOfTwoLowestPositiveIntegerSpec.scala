package com.github.mktdo.codewars

import org.scalatest._

class SumOfTwoLowestPositiveIntegerSpec extends FlatSpec with Matchers {

  val tests = List(
    (List(5, 8, 12, 18, 22),   13),
    (List(7, 15, 12, 18, 22),  19),
    (List(25, 42, 12, 18, 22), 30),
    (List(1, 8, 12, 18, 5),     6),
    (List(13, 12, 5, 61, 22),  17)
  )

  tests.foreach {
    case (input, expected) =>
      s"sumTwoSmallest($input)" should s"return $expected" in {
        SumOfTwoLowestPositiveInteger.sumTwoSmallest(input) should be (expected)
      }
  }
}
