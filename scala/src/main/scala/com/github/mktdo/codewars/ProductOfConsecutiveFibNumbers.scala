package com.github.mktdo.codewars

// https://www.codewars.com/kata/5541f58a944b85ce6d00006a/train/scala

object ProductOfConsecutiveFibNumbers {
  def productFib(prod: Long): Array[Long] = {
    var memo: Map[Int, Long] = Map[Int, Long](0 -> 0, 1 -> 1)

    def fib(n: Int): Long = {
      if (memo.contains(n)) memo(n)
      else if (n < 0) 0
      else {
        val value = fib(n - 1) + fib(n - 2)
        memo = memo.updated(n, value)
        value
      }
    }

    def productFib(n: Int): Long = fib(n) * fib(n + 1)

    val index = (1 to 100).view.map(productFib).filter(n => n > 0 && n < prod).toArray.size
    Array[Long](fib(index + 1), fib(index + 2), if (productFib(index + 1) == prod) 1 else 0)
  }
}
