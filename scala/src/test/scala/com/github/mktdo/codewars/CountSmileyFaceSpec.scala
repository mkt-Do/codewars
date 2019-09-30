package com.github.mktdo.codewars

import org.scalatest._

class CountSmileyFaceSpec extends FunSpec with Matchers {
  describe("Example Tests") {
    it("Run successfully") {
      CountSmileyFace.countSmileys(Vector.empty) shouldBe 0
      CountSmileyFace.countSmileys(Vector(":D",":~)",";~D",":)")) shouldBe 4
      CountSmileyFace.countSmileys(Vector(":)",":(",":D",":O",":;")) shouldBe 2
      CountSmileyFace.countSmileys(Vector(";]", ":[", ";*", ":$", ";-D")) shouldBe 1
    }
  }
}
