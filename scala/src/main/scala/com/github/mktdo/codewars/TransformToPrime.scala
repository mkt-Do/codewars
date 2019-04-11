package com.github.mktdo.codewars

// https://www.codewars.com/kata/transform-to-prime/train/scala

object TransformToPrime {
  def minimumNumber(numbers: Seq[Int]): Int = {
    val sum = numbers.sum
    if (BigInt(sum).isProbablePrime(4)) 0
    else (1 to sum).filter(x => BigInt(x + sum).isProbablePrime(4)).head
  }
}
