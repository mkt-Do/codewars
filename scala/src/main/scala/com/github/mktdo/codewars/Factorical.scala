package com.github.mktdo.codewars

object Factorical {
  // I don't know this code is OK in local machine, but in codewars web app this code doesn't work
  // def !(n: Int, res: BigInt = BigInt(1)): BigInt = if (n == 0) res else res(n - 1, n * res)
  def !(n: Int): BigInt = {
    def rec(m: Int, res: BigInt = BigInt(1)): BigInt = {
      if (m == 0)
        res
      else
        rec(m - 1, res * m)  
    }
    rec(n)
  }
}
