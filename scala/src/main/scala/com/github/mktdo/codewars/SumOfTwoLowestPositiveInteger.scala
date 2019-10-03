package com.github.mktdo.codewars

object SumOfTwoLowestPositiveInteger {
  def sumTwoSmallest(numbers: List[Int]): Int = numbers.sorted.take(2).sum
}
