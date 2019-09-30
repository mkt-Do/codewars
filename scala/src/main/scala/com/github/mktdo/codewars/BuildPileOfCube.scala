package com.github.mktdo.codewars

import scala.annotation.tailrec

object BuildPileOfCube {
  def findNb(m: Long): Int = {
    @tailrec
    def rec(pile: Long, n: Int): Int = {
      if (pile > m)
        - 1
      else if (pile == m)
        n - 1
      else {
        val nl = n.toLong
        rec(pile + (nl * nl * nl), n + 1)
      }
    }
    rec(0, 1)
  }
}
