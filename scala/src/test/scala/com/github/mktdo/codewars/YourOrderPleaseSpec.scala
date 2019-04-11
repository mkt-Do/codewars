package com.github.mktdo.codewars

import org.scalatest._

class YourOrderPleaseTest extends FlatSpec with Matchers {

  "order(\"is2 Thi1s T4est 3a\")" should "return \"Thi1s is2 3a T4est\"" in {
    YourOrderPlease.order("is2 Thi1s T4est 3a") should be ("Thi1s is2 3a T4est")
  }
}
