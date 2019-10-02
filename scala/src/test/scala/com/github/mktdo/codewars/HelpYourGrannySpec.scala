package com.github.mktdo.codewars

import org.scalatest._
import org.scalatest.Assertions._

import HelpYourGrannySpec._

class HelpYourGrannySpec extends FlatSpec {
  it should "pass basic tests" in {
    val friends1 = List("A1", "A2", "A3", "A4", "A5")
    val fTowns1 = List(("A1", "X1"), ("A2", "X2"), ("A3", "X3"), ("A4", "X4"))
    val distTable1 = Map("X1" -> 100.0, "X2" -> 200.0, "X3" -> 250.0, "X4" -> 300.0)
    testing(friends1, fTowns1, distTable1, 889)

    val friends2 = List("A1", "A2", "A3", "A4", "A5")
    val fTowns2 = List(("A1", "X1"), ("A2", "X2"), ("A3", "X3"), ("A4", "X4"), ("A5", "X5"))
    val distTable2 = Map("X1" -> 100.0, "X2" -> 200.0, "X3" -> 250.0, "X4" -> 300.0, "X5" -> 320.0)
    testing(friends2, fTowns2, distTable2, 1020)


  }
}

object HelpYourGrannySpec {

  private def testing(arrFriends: List[String], ftwns: List[(String, String)], h: Map[String, Double], expect: Int): Unit = {
    val actual: Int = HelpYourGranny.tour(arrFriends, ftwns, h)
    println("Actual: " + actual)
    println("Expect: " + expect)
    println("-")
    assertResult(expect){actual}
  }
}

