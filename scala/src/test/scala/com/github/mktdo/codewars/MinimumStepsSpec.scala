package com.github.mktdo.codewars

// You can test using ScalaTest (http://www.scalatest.org/).
import org.scalatest._

// TODO: replace this example test with your own, this is just here to demonstrate usage.
// See http://www.scalatest.org/at_a_glance for example usages
class MinimumStepsSpec extends FlatSpec with Matchers {

  import MinimumSteps._

  "example tests" should "be ok" in {
    minimumSteps(Array( 4,  6,  3), 7) should be (1)
    minimumSteps(Array(10,  9,  9, 8), 17) should be (1)
    minimumSteps(Array( 8,  9,  4, 2), 23) should be (3)
    minimumSteps(Array(19, 98, 69, 28, 75, 45, 17, 98, 67), 464) should be (8)
  }
}
