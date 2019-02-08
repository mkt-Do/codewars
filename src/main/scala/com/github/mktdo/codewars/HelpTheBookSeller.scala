package com.github.mktdo.codewars

// https://www.codewars.com/kata/help-the-bookseller/train/scala

object HelpTheBookSeller {
  def stockSummary(lstOfArt: Array[String], lstOfCat: Array[String]): String = {
    // your code
    if (lstOfArt.size == 0 || lstOfCat.size == 0) return ""
    val codeAndStockTuples: Array[(String, Int)] = lstOfArt.map { art =>
      (art.split(" ")(0).head.toString, art.split(" ")(1).toInt)
    }
    val summariesByCode: Array[(String, Int)] = lstOfCat.map { cat =>
      (cat, codeAndStockTuples.collect { case (code, stock) if code == cat => stock }.sum)
    }
    val (headCode, headStock): (String, Int) = summariesByCode.head
    summariesByCode.tail.foldLeft(s"($headCode : $headStock)"){ (acc, v) => v match {
      case (code, summary) => s"$acc - ($code : $summary)"
    }}
  }
}
