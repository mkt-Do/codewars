package com.github.mktdo.codewars

import org.scalatest._

class FindTheSmallestIntegerInArraySpec extends FunSpec {
  describe("SmallestIntegersFinder") {
    it("fixedTests") {
      assertResult(8) {FindTheSmallestIntegerInArray.findSmallestInt(List(78,56,232,12,8))}
      assertResult(12) {FindTheSmallestIntegerInArray.findSmallestInt(List(78,56,232,12,18))}
      assertResult(56) {FindTheSmallestIntegerInArray.findSmallestInt(List(78,56,232,412,228))}
      assertResult(0) {FindTheSmallestIntegerInArray.findSmallestInt(List(78,56,232,12,0))}
      assertResult(1) {FindTheSmallestIntegerInArray.findSmallestInt(List(1,56,232,12,8))}
    }
  }
}
