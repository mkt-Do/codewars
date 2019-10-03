package com.github.mktdo.codewars

object YoureASquare {
  import scala.math.{ pow, sqrt }
  def isSquare(x: Int): Boolean = x == pow(sqrt(x).toInt, 2).toInt
}
