package com.github.mktdo.codewars

object IrreducibleSumOfRationals {
  def sumFracts(lst: Array[(Long, Long)]): String = {
    def euclid(n: BigInt, m: BigInt): BigInt = {
      if (n % m == 0)
        m
      else
        euclid(m, n % m)
    }
    if (lst.isEmpty)
      "0"
    else {
      val denominator: BigInt = lst.map { case (_, deno) => BigInt(deno) }.product
      val fraction: BigInt = lst.map { case (fra, deno) => BigInt(fra) * denominator / deno }.sum
      val euc = if (denominator >= fraction) euclid(denominator, fraction) else euclid(fraction, denominator)
      if (denominator / euc == BigInt(1)) s"${fraction / euc}" else s"[${fraction / euc}, ${denominator / euc}]"
    }
  }
}
