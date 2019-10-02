package com.github.mktdo.codewars

object HelpYourGranny {
  import scala.math.{ abs, sqrt }
  def tour(arrFriends: List[String], ftwns: List[(String, String)], h: Map[String, Double]): Int = {
    val dists = 0.0 +: arrFriends.flatMap(friend => ftwns.toMap.get(friend) match {
      case Some(twn) => h.get(twn)
      case None => None
    }) :+ 0.0
    dists.zip(dists.tail).map { case (d1, d2) => sqrt(abs(d1 * d1 - d2 * d2)) }.sum.toInt
  }
}
