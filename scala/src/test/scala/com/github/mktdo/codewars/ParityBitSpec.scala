package com.github.mktdo.codewars

import org.scalatest.FunSuite

class ParityBitSpec extends FunSuite {

  test("Samples") {
    assert(ParityBit.parityBit("01011001") === "0101100")
    assert(ParityBit.parityBit("01101110 01100000") === "error 0110000")
    assert(ParityBit.parityBit("10100011 00111001 11001100") === "1010001 0011100 1100110")
  }
}
