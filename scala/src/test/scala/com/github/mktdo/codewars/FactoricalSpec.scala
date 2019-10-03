package com.github.mktdo.codewars

import org.scalatest.FunSuite
import scala.language.postfixOps

class FactoricalSpec extends FunSuite {

  test("Samples") {
    assert((0!) === 1)
    assert((1!) === 1)
    assert((2!) === 2)
    assert((3!) === 6)
    assert((4!) === 24)
    assert((5!) === 120)
    assert((6!) === 720)
    assert((7!) === 5040)
  }

  implicit class IntExtension(n: Int) {
    def !(): BigInt = Factorical.!(n)
  }
}
