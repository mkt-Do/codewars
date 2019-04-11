package com.github.mktdo.codewars

// https://www.codewars.com/kata/playing-with-digits/train/scala

object PlayingWithDigits {
  import scala.math.pow
  def digPow(n: Int, p: Int): Int = {
    val sum = n.toString.zipWithIndex.map { case (c, i) => pow(c.toString.toInt, i + p).toInt }.sum
    if (sum % n == 0) sum / n else -1
  }
}
