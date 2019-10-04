package com.github.mktdo.codewars

object TakeATenMinuteWalk {
  def isValidWalk(walk: Seq[Char]): Boolean = {
    def rec(seq: Seq[Char], m: Map[Char, Int] = Map[Char, Int]('n' -> 0, 's' -> 0, 'w' -> 0, 'e' -> 0)): Boolean = {
      if (seq.isEmpty)
        m('n') == m('s') && m('w') == m('e')
      else
        rec(seq.tail, m + (seq.head -> (m(seq.head) + 1)))
    }
    if (walk.size == 10)
      rec(walk)
    else
      false
  }
}
