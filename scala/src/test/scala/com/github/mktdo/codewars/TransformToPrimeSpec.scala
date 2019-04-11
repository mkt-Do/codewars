package com.github.mktdo.codewars

// You can test using ScalaTest (http://www.scalatest.org/).
import org.scalatest.{ FeatureSpec, GivenWhenThen }

class TransformToPrimeSpec extends FeatureSpec with GivenWhenThen {
  def randomInt(a: Int, b: Int) = (Math.random() * (b - a) + a).toInt

  val examples: Seq[(Seq[Int], Int)] = Seq(
      (Seq(1,2,3), 1),
      (Seq(5,2), 0),
      (Seq(1,1,1), 0),
      (Seq(2,12,8,4,6), 5),
      (Seq(50,39,49,6,17,28), 2)
    )

  feature("The TransformToPrime object can compute the smallest number needed to convert the sum of a list of integers to a prime number") {
    examples.foreach { case (input, expectedOutput) =>
      scenario(s"Computing minimumNumber${input.mkString(",")}) should result in $expectedOutput") {
        Given(s"input ${input.mkString(",")}")
        When(s"the result should be $expectedOutput")
        assert(TransformToPrime.minimumNumber(input) == expectedOutput)
      }
    }
  }
}
