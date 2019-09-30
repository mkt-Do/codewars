package com.github.mktdo.codewars

import org.scalatest._

class MySpec extends FlatSpec {

  import com.github.mktdo.codewars.MakeItTypeCheck._

  "Non-zero integer" should "evaluate to true" in {
      assertResult("hi")(if (42) "hi" else "ho")
  }

  "Zero integer" should "evaluate to false" in {
      assertResult("ho")(if (0) "hi" else "ho")
  }

  "Boolean true" should "evaluate to 1" in {
      assertResult(43)(42 + true)
  }

  "Boolean false" should "evaluate to 0" in {
      assertResult(0)(42 * false)
  }

}
