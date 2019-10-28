package com.github.mktdo.codewars

object MinimumSteps {
  def minimumSteps(numbers: Array[Int], k: Int): Int = {
    def rec(ls: Array[Int], sum: Int = 0, cnt: Int = -1): Int = {
      if (sum >= k)
        cnt
      else
        rec(ls.tail, sum + ls.head, cnt + 1)
    }
    rec(numbers.sorted)
  }
}

