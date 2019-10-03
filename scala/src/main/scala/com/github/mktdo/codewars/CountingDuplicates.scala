package com.github.mktdo.codewars

object CountingDuplicates {
  def duplicateCount(str: String): Int = {
    def rec(s: String, m: Map[Char, Int] = Map[Char, Int]()): Int = {
      if (s.isEmpty)
        m.filter { case (_, n) => n > 1 }.size
      else {
        val c = Character.toLowerCase(s.head)
        val cnt = if (m.contains(c)) m(c) + 1 else 1
        rec(s.tail, m + (c -> cnt))
      }
    }
    rec(str)
  }
}
