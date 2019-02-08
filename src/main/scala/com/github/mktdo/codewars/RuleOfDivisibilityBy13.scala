package com.github.mktdo.codewars

// https://www.codewars.com/kata/a-rule-of-divisibility-by-13/train/scala

object RuleOfDivisibilityBy13 {
  def thirt(n: Long): Long = {
    def rec(num: Long): Long = {
      val res = num.toString
        .reverse
        .zipWithIndex
        .map { case (c, i) => (c.asDigit * (scala.math.pow(10, i) % 13)).toLong }
        .sum
      if (num == res) res else rec(res)
    }
    rec(n)
  }
}
