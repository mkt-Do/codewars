package com.github.mktdo.codewars

object DirectionsReduction {

  def dirReduc(arr: Array[String]): Array[String] = {
    def isOppositeDirection(dir1: String, dir2: String): Boolean = {
      dir1 == "NORTH" && dir2 == "SOUTH" ||
          dir1 == "SOUTH" && dir2 == "NORTH" ||
          dir1 == "EAST" && dir2 == "WEST" ||
          dir1 == "WEST" && dir2 == "EAST"
    }
    def rec(ls: List[String], res: List[String] = List[String]()): List[String] = ls match {
      case Nil => res
      case h :: tail if res.isEmpty => rec(tail, List[String](h))
      case h :: tail if isOppositeDirection(h, res.last) => rec(tail, res.init)
      case h ::tail => rec(tail, res :+ h)
    }
    rec(arr.toList).toArray
  }
}
