package com.github.mktdo.codewars

// https://www.codewars.com/kata/tortoise-racing/train/scala

object TortoiseRacing {
  // when v1 >= v2 return Array(-1,-1,-1)
  def race(v1: Int, v2: Int, g: Int): Array[Int] = {
    // v1 * t + g = v2 * t
    if (v1 >= v2) Array(-1, -1, -1)
    else {
      val time: BigDecimal = BigDecimal(g) / BigDecimal(v2 - v1)
      val hour: Int = time.doubleValue.toInt
      val minTime: BigDecimal = (time - hour) * 60
      val min: Int = minTime.doubleValue.toInt
      val sec: Int = ((minTime - min) * 60).doubleValue.toInt
      Array(hour, min, sec)
    }
  }
}
