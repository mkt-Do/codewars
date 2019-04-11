package com.github.mktdo.codewars

// https://www.codewars.com/kata/your-order-please/train/scala

object YourOrderPlease {
  def order(str: String): String = {
    val r = """\d""".r
    str.split(" ")
      .map { s => (r.findFirstMatchIn(s).getOrElse("0").toString.toInt, s) }
      .sortBy(_._1)
      .map(_._2)
      .mkString(" ")
  }
}
