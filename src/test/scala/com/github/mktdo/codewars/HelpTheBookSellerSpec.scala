package com.github.mktdo.codewars

import org.scalatest._
import org.scalatest.Assertions._

class HelpTheBookSellerTest extends FlatSpec {
  it should "pass basic tests" in {
    var b = Array("BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600")
    var c = Array("A", "B", "C", "D")
    var res = "(A : 0) - (B : 1290) - (C : 515) - (D : 600)"
    HelpTheBookSellerTest.testing(b, c, res)

    b = Array("ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600")
    c = Array("A", "B")
    res = "(A : 200) - (B : 1140)"
    HelpTheBookSellerTest.testing(b, c, res)

  }
}

object HelpTheBookSellerTest {
  private def testing(lstOfArt: Array[String], lstOfCat: Array[String], expect: String): Unit = {
    val actual: String = HelpTheBookSeller.stockSummary(lstOfArt, lstOfCat)
    println("Actual: " + actual)
    println("Expect: " + expect + "\n")
    println("*")
    assertResult(expect){actual}
  }
}


