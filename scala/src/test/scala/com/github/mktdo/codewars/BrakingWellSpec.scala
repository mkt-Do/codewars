package com.github.mktdo.codewars

import org.scalatest._
import org.scalatest.Assertions._
import BrakingWellSpec._

class BrakingWellSpec extends FlatSpec {
  it should "pass basic tests dist" in {
    assertFuzzyDist(144, 0.3, 311.83146449201496)
    assertFuzzyDist(92, 0.5, 92.12909477605366)

  }
  it should "pass basic tests speed" in {
    assertFuzzySpeed(159, 0.8, 153.79671564846308);
    assertFuzzySpeed(164, 0.7, 147.91115701756493);

  }
}

object BrakingWellSpec {

  private def assertFuzzyDist(v: Double, mu: Double, exp: Double): Unit = {
    println("Testing dist\n" + v + ", " + mu)
    var inrange: Boolean = false
    val merr: Double = 1e-2
    val actual: Double = BrakingWell.dist(v, mu)
    inrange = Math.abs(actual - exp) <= merr
    if (inrange == false) {
      println("Expected mean must be near " + exp + ", got " + actual)
    }
    assertResult(true){inrange}
    println("-")
  }
  private def assertFuzzySpeed(d: Double, mu: Double, exp: Double): Unit = {
    println("Testing speed\n" + d + ", " + mu)
    var inrange: Boolean = false
    val merr: Double = 1e-2
    val actual: Double = BrakingWell.speed(d, mu)
    inrange = Math.abs(actual - exp) <= merr
    if (inrange == false) {
      println("Expected mean must be near " + exp + ", got " + actual)
    }
    assertResult(true){inrange}
    println("-")
  }
}

