package com.github.mktdo.codewars

import org.scalatest._
import scala.util.Random

class GetMiddleCharacterSpec extends FlatSpec with Matchers {

  val tests = List(
    ("test",    "es"),
    ("testing", "t"),
    ("middle",  "dd"),
    ("A",       "A"),
    ("of",      "of")
  )

  tests.foreach {
    case (input, expected) =>
      s"middle($input)" should s"return $expected" in {
        GetMiddleCharacter.middle(input) should be (expected)
      }
  }
}
