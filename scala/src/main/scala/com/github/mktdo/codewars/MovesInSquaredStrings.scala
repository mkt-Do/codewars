package com.github.mktdo.codewars

object MovesInSquaredStrings {
  def horMirror(strng: String): String = strng.split("\n").reverse.mkString("\n")

  def vertMirror(strng: String): String = strng.split("\n").map(_.reverse).mkString("\n")

  def oper(f: String => String, s: String): String = f(s)
}
