package com.github.mktdo.codewars

import org.scalatest.{FlatSpec, Matchers}

class NumberOfPeopleInTheBusSpec extends FlatSpec with Matchers {
  "The bus with stops List((10,0), (3,5), (5,8))" should "have 5 people in the end" in {
    NumberOfPeopleInTheBus.number(List((10, 0), (3, 5), (5,8))) shouldBe 5
  }

  "The bus with stops List((3,0), (9,1), (4,10), (12,2), (6,1), (7,10))" should "have 17 people in the end" in {
    NumberOfPeopleInTheBus.number(List((3, 0), (9, 1), (4, 10), (12, 2), (6, 1), (7, 10))) shouldBe 17
  }

  "The bus with stops List((3,0), (9,1), (4,8), (12,2), (6,1), (7,8))" should "have 17 people in the end" in {
    NumberOfPeopleInTheBus.number(List((3, 0), (9, 1), (4, 8), (12, 2), (6, 1), (7, 8))) shouldBe 21
  }
}
