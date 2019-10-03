package com.github.mktdo.codewars

object CountOfPositivesAndNegatives {
  def countPositivesSumNegatives(integers: Array[Int]): (Int, Int) = {
    val (posi, nega) = integers.partition(_ > 0)
    (posi.size, nega.sum)
  }
}
