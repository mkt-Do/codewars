package com.github.mktdo.codewars

// https://www.codewars.com/kata/mumbling/train/scala

object Mumbling {
  def accum(s: String): String = s.zipWithIndex.map { case (c, i) =>
    c.toString.toUpperCase + c.toString.toLowerCase * i
  }.mkString("-")
}
