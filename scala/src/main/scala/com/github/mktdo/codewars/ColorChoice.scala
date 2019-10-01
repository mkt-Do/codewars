package com.github.mktdo.codewars

object ColorChoice {
  def checkchoose(m: Long, n: Int): Long = {
    def fact(x: Int, res: BigInt = BigInt(1)): BigInt = if (x <= 1) res else fact(x - 1, res * x)
    def rec(ns: Array[Int], res: Long = -1L): Long = {
      if (ns.isEmpty)
        res
      else {
        val comb: Long = (fact(n) / (fact(ns.head) * fact(n - ns.head))).toLong
        rec(ns.tail, if (m == comb) ns.head else res)
      }
    }
    rec(Range(1, n / 2 + 1).toArray)
  }
}
