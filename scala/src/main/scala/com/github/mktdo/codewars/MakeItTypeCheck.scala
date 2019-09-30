package com.github.mktdo.codewars

object MakeItTypeCheck {
  implicit def fromBoolToInt(b: Boolean): Int = if (b) 1 else 0
  implicit def fromIntToBool(n: Int): Boolean = n != 0
}
