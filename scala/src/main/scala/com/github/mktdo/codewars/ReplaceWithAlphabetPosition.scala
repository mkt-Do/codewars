package com.github.mktdo.codewars

object ReplaceWithAlphabetPosition {
  def alphabetPosition(text: String): String = {
    val alphabetMap: Map[Char, Int] = ('a' to 'z').zipWithIndex.map { case (c, i) => (c, i + 1) }.toMap
    text.toLowerCase.map(c => alphabetMap.get(c) match {
      case Some(n) => n.toString
      case None => ""
    }).filter(_ != "").mkString(" ")
  }
}
