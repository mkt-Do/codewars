package com.github.mktdo.codewars

import org.scalatest._
import org.scalatest.Assertions._

import DirectionsReductionSpec._

class DirectionsReductionSpec extends FlatSpec {
  it should "pass basic tests" in {
    var a = Array("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST")
    testing(a, Array("WEST"))
    a = Array("NORTH", "WEST", "SOUTH", "EAST")
    testing(a, Array("NORTH", "WEST", "SOUTH", "EAST"))
    a = Array("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "NORTH")
    testing(a, Array("NORTH"))

  }
}

object DirectionsReductionSpec {
  private def testing(arr: Array[String], expect: Array[String]): Unit = {
    print("arr " + arr.mkString(", "))
    val actual: Array[String] = DirectionsReduction.dirReduc(arr)
    println("\nActual: " + actual.mkString(", "))
    println("Expect: " + expect.mkString(", "))
    println("-")
    assertResult(expect){actual}
  }
}

