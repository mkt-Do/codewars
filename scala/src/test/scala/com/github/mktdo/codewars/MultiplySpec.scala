package com.github.mktdo.codewars

import org.scalatest.FunSpec
import scala.util.Random
import Multiply._

class MultiplySpec extends FunSpec {
  describe("Multiply.multiply") {
    it("should pass fixed tests") {
      assertResult(1) {multiply(1, 1)}
      assertResult(2) {multiply(1, 2)}
      assertResult(6) {multiply(2, 3)}
    }
  }
}
