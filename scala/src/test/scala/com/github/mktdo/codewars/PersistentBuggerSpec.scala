package com.github.mktdo.codewars

import org.scalatest._

class PersistentBuggerTest extends FlatSpec with Matchers {

  val tests = List(
    (39, 3),
    (4, 0),
    (25, 2),
    (999, 4)
  )

  tests.foreach {
    case (input, expected) =>
      s"determinant($input)" should s"return $expected" in {
        PersistentBugger.persistence(input) should be (expected)
      }
  }
}
