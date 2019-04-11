package com.github.mktdo.codewars

// https://www.codewars.com/kata/persistent-bugger/train/scala

object PersistentBugger {
  def persistence(n: Int): Int = {
    def rec(num: Int, count: Int = 0): Int = num match {
      case m if m < 0 => throw new IllegalArgumentException("Illegal Argument")
      case m if m < 10 => count
      case _ => rec(num.toString.split("").map(_.toInt).product, count + 1)
    }
    rec(n)
  }
}
