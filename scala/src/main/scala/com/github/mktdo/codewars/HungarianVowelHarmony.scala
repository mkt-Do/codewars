package com.github.mktdo.codewars

object HungarianVowelHarmony {
  def dative(word: String): String = {
    def rec(s: String): String = {
      s.head match {
        case 'e' | 'é' | 'i' | 'í' | 'ö' | 'ő' | 'ü' | 'ű' => "nek"
        case 'a' | 'á' | 'o' | 'ó' | 'u' | 'ú' => "nak"
        case _ => rec(s.tail)
      }
    }
    s"${word}${rec(word.reverse)}"
  }
}
