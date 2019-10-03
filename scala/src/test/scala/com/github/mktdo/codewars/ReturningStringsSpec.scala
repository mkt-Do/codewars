package com.github.mktdo.codewars

// You can test using ScalaTest (http://www.scalatest.org/).
import org.scalatest._

// TODO: replace this example test with your own, this is just here to demonstrate usage.
// See http://www.scalatest.org/at_a_glance for example usages
class ReturningStringsSpec extends FlatSpec with Matchers {
  "greet(\"Ryan\")" should "return Hello, Ryan how are you doing today?" in {
    ReturningStrings.greet("Ryan") should be ("Hello, Ryan how are you doing today?")
  }
  "greet(\"Shingles\")" should "return Hello, Shingles how are you doing today?" in {
    ReturningStrings.greet("Shingles") should be ("Hello, Shingles how are you doing today?")
  }
}
