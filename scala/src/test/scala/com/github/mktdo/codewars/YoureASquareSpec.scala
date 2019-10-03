package com.github.mktdo.codewars

import org.scalatest._

class YoureASquareSpec extends FlatSpec with Matchers {
  val tests = List(
    (-1,  false),
    (0,   true),
    (3,   false),
    (4,   true),
    (25,  true),    
    (26,  false)
  )

  tests.foreach {
    case (input, expected) =>
      s"isSquare($input)" should s"return $expected" in {
        YoureASquare.isSquare(input) should be (expected)
      }
  }
}
