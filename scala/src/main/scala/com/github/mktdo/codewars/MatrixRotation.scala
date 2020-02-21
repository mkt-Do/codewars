package com.github.mktdo.codewars

object MatrixRotation {

  def rotateClockwise(matrix: Array[String]): Array[String] = {
    def rec(ar: Array[String], res: Array[String] = Array[String]()): Array[String] = {
      if (ar.filter(_ != "").isEmpty)
        res
      else
        rec(ar.map(_.tail), res :+ ar.map(_.head).reverse.mkString(""))
    }
    rec(matrix)
  }
}
