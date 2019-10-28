package com.github.mktdo.codewars

object BrakingWell {
  import scala.math.{ pow, sqrt }
  val g = 9.81
  def dist(v: Double, mu: Double): Double = {
    val mps = v * 1000 / 3600
    mps + pow(mps, 2) / (2 * mu * g)
  }
  def speed(d: Double, mu: Double): Double = {
    (-1 * mu * g + sqrt(pow(mu * g, 2) + 2 * mu * g * d)) * 3600 / 1000
  }
}
