package com.github.mktdo.codewars

object OrderedCountOfCharacter {
  def orderedCount(chars: String): List[(Char, Int)] = {
    val map = chars.distinct.groupBy(c => chars.count(_ == c)).flatMap {
      case (cnt, st) => st.map((_, cnt))
    }
    chars.distinct.map(c => (c, map(c))).toList
  }
}
