package com.github.mktdo.codewars

// You can test using ScalaTest (http://www.scalatest.org/).
import org.scalatest._

// TODO: replace this example test with your own, this is just here to demonstrate usage.
// See http://www.scalatest.org/at_a_glance for example usages
class TortoiseRacingSpec extends FlatSpec with Matchers {
  "race(720, 850, 70)" should "return 0, 32, 18" in {
    TortoiseRacing.race(720, 850, 70) should be (Array(0,32,18))
  }
  "race(80, 91, 37)" should "return 3, 21, 49" in {
    TortoiseRacing.race(80, 91, 37) should be (Array(3,21,49))
  }
  "race(80, 100, 40)" should "return 2, 0, 0" in {
    TortoiseRacing.race(80, 100, 40) should be (Array(2,0,0))
  }
}
