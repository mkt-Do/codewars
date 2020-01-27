package com.github.mktdo.codewars

object MovesInSquaredStrings3 {

  private def stringTrans(strng: String): Array[String] = strng.split("\n")
  private def diag(a: Array[String], res: Array[String] = Array[String]()): Array[String] = {
    if (a.filter(_ != "").isEmpty) res
    else {
      val str = a.map(_.head).mkString("")
      diag(a.map(_.tail), res :+ str)
    }
  }
  def diag1Sym(strng: String): String = diag(stringTrans(strng)).mkString("\n")
  def rot90Clock(strng: String): String = diag(stringTrans(strng)).map(_.reverse).mkString("\n")
  def selfieAndDiag1(strng: String): String = {
    val arr = stringTrans(strng)
    def combineStr(ar1: Array[String], ar2: Array[String], res: Array[String] = Array[String]()): String = {
      if (ar1.isEmpty && ar2.isEmpty) res.mkString("\n")
      else combineStr(ar1.tail, ar2.tail, res :+ s"${ar1.head}|${ar2.head.reverse}")
    }
    combineStr(arr, diag(arr).map(_.reverse))
  }
  def oper(f: String => String, s: String): String = f(s)
}
