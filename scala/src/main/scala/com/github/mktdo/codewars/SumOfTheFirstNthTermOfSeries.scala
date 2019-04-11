package com.github.mktdo.codewars

// https://www.codewars.com/kata/sum-of-the-first-nth-term-of-series/train/scala

object SumOfTheFirstNthTermOfSeries {
  def seriesSum(n: Int): String = {
    // your code here
    def sumrec(num: Int, result: Double = 0): Double = num match {
      case 0 => result
      case m if m < 0 => throw new IllegalArgumentException("Illegal number")
      case _ => sumrec(num - 1, result + (1.0 / (3 * num - 2)))
    }
    BigDecimal(sumrec(n)).setScale(2, BigDecimal.RoundingMode.HALF_UP).toString
  }
}
