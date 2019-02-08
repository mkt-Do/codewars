package com.github.mktdo.codewars

// https://www.codewars.com/kata/big-factorial/train/scala

object BigFactorical {
  def factorial(n: Int): Option[BigInt] = {
    def fact(num: Int, result: BigInt = BigInt(1)): BigInt =
      if (num == 0) result else fact(num - 1, result * num)
    if (n < 0) None else Option(fact(n))
  }
}
