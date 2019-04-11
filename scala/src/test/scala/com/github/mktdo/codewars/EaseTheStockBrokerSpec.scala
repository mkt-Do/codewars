package com.github.mktdo.codewars

import org.scalatest._
import org.scalatest.Assertions._

import EaseTheStockBrokerTest._

class EaseTheStockBrokerTest extends FlatSpec {
  it should "pass basic tests" in {
    var l = "GOOG 300 542.0 B, AAPL 50 145.0 B, CSCO 250.0 29 B, GOOG 200 580.0 S";
    var sol = "Buy: 169850 Sell: 116000; Badly formed 1: CSCO 250.0 29 B ;";
    testing(l, sol)

    l = "ZNGA 1300 2.66 B, CLH15.NYM 50 56.32 B, OWW 1000 11.623 B, OGG 20 580.1 B";
    sol = "Buy: 29499 Sell: 0";
    testing(l, sol)

  }
}

object EaseTheStockBrokerTest {
  private def testing(lst: String, expect: String): Unit = {
    println("Testing: " + lst)
    val actual: String = EaseTheStockBroker.balanceStatements(lst)
    println("Actual: " + actual)
    println("Expect: " + expect)
    println("-")
    assertResult(expect){actual}
  }
}

