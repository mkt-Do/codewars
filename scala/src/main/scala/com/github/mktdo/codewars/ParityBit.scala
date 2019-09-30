package com.github.mktdo.codewars

object ParityBit {
  def parityBit(s: String): String = {
    s.split(" ").map(bit => {
      val (values, parity) = (bit.reverse.tail.reverse, bit.last)
      val cnt = values.count(_ == '1')
      if (cnt % 2 == 1 && parity == '1' || cnt % 2 == 0 && parity == '0') values else "error"
    }).mkString(" ")
  }
}
