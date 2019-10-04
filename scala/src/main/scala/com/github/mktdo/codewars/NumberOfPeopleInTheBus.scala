package com.github.mktdo.codewars

object NumberOfPeopleInTheBus {
  def number(busStops: List[(Int, Int)]): Int = busStops.foldRight(0){ (v, acc) => acc + v._1 - v._2 }
}
