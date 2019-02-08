package com.github.mktdo.codewars

import org.scalatest._

class ReverseLetterSpec extends FlatSpec with Matchers {
  "reverseLetter(\"krishan\")" should "\"nahsirk\"" in {
    ReverseLetter.reverseLetter("krishan") should be ("nahsirk")
  }
  "reverseLetter(\"ultr53o?n\")" should "\"nortlu\"" in {
    ReverseLetter.reverseLetter("ultr53o?n") should be ("nortlu")
  }
  "reverseLetter(\"ab23c\")" should "\"cba\"" in {
    ReverseLetter.reverseLetter("ab23c") should be ("cba")
  }
  "reverseLetter(\"krish21an\")" should "\"nahsirk\"" in {
    ReverseLetter.reverseLetter("krish21an") should be ("nahsirk")
  }
  "reverseLetter(\"1234\")" should "\"\"" in {
    ReverseLetter.reverseLetter("1234") should be ("")
  }
}
