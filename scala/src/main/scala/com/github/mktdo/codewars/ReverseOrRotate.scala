package com.github.mktdo.codewars

// https://www.codewars.com/kata/reverse-or-rotate/train/scala

object ReverseOrRotate {
  def revRot(strng: String, sz: Int): String = {
    if (sz <= 0 || strng.isEmpty || strng.length < sz) ""
    else strng.grouped(sz).takeWhile(_.length >= sz).collect {
      case s if s.map(x => x.toString.toInt * x.toString.toInt * x.toString.toInt).sum % 2 == 0 => s.reverse
      case s => s"${ s.tail }${ s.head }"
    }.mkString("")
  }
}
