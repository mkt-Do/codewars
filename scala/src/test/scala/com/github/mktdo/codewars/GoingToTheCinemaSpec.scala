package com.github.mktdo.codewars

import org.scalatest._
import org.scalatest.Assertions._

import GoingToTheCinemaTest._

class GoingToTheCinemaTest extends FlatSpec { 
  it should "pass basic tests" in {
    testing(500, 15, 0.9, 43)
    testing(100, 10, 0.95, 24)
    
  }
}

object GoingToTheCinemaTest {

    private def testing(card: Int, ticket: Int, perc: Double, expect: Int): Unit = {
        println("Testing: " + card +", " + ticket + ", " + perc)
        val actual: Int = GoingToTheCinema.movie(card, ticket, perc)
        println("Actual: " + actual)
        println("Expect: " + expect)
        println("*")
        assertResult(expect){actual}
    }
}

