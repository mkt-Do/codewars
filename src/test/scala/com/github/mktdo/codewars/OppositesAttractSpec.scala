package com.github.mktdo.codewars

import org.scalatest._

class OppositesAttractSpec extends FlatSpec with Matchers {
  "lovefunc(1, 4)" should "return true" in {
    OppositesAttract.lovefunc(1, 4) should be (true)
  }
  "lovefunc(2, 2)" should "return false" in {
    OppositesAttract.lovefunc(2, 2) should be (false)
  }
  "lovefunc(0, 1)" should "return true" in {
    OppositesAttract.lovefunc(0, 1) should be (true)
  }
  "lovefunc(0, 0)" should "return false" in {
    OppositesAttract.lovefunc(0, 0) should be (false)
  }
}
