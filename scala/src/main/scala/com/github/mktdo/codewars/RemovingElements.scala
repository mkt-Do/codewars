package com.github.mktdo.codewars

object RemovingElements {
  def removeEveryOther[T](list: List[T]): List[T] = list.zipWithIndex.collect {
    case (v, i) if i % 2 == 0 => v
  }
}
