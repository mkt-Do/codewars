package com.github.mktdo.codewars

object EnglishBeggars {
  def beggars(values: List[Int], n: Int): List[Int] = if (n == 0) List[Int]() else {
    val ls = values ++ List.fill(n - values.length)(0)
    ls.zipWithIndex.groupBy { case (_, i) => (i + 1) % n }.map {
      case (k, v) => if (k == 0) (n, v.map(_._1)) else (k, v.map(_._1))
    }.toSeq.sortBy(_._1).map(_._2.sum).toList
  }
}
