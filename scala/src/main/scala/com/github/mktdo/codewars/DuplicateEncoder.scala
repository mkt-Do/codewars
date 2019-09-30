package com.github.mktdo.codewars

object DuplicateEncoder {
  def duplicateEncode(word: String): String = {
    def rec(s: String, m: Map[Char, Int] = Map.empty[Char, Int]): String = {
      if (s == "")
        word.map(c => if (m(Character.toUpperCase(c)) > 1) ')' else '(')
      else {
        val c = Character.toUpperCase(s.head)
        val cnt = if (m.contains(c)) m(c) + 1 else 1
        rec(s.tail, m + (c -> cnt))
      }
    }
    rec(word)
  }
}
