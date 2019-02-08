package com.github.mktdo.codewars

// https://www.codewars.com/kata/simple-fun-number-176-reverse-letter/train/scala

object ReverseLetter {
  def reverseLetter(str: String): String = str.filter(_.toString.matches("""[a-z]|[A-Z]""")).reverse
}
