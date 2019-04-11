package com.github.mktdo.codewars

// https://www.codewars.com/kata/maximum-length-difference/train/scala

object MaximumLengthDifference {
  def mxdiflg(a1: List[String], a2: List[String]): Int =
    if (a1.isEmpty || a2.isEmpty) -1
    else {
      val a1Max = a1.map(_.length).max
      val a1Min = a1.map(_.length).min
      val a2Max = a2.map(_.length).max
      val a2Min = a2.map(_.length).min
      Array(a1Max - a2Min, a2Max - a1Min).max
    }
}
