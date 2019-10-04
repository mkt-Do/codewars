package com.github.mktdo.codewars

import org.scalatest._
import org.scalatest.Assertions._

import MovesInSquaredStringsSpec._

class MovesInSquaredStringsSpec extends FlatSpec { 
  it should "pass basic tests operArray vertMirror" in {
    var s = "hSgdHQ\nHnDMao\nClNNxX\niRvxxH\nbqTVvA\nwvSyRu"
    var r = "QHdgSh\noaMDnH\nXxNNlC\nHxxvRi\nAvVTqb\nuRySvw"
    testing(MovesInSquaredStrings.oper(MovesInSquaredStrings.vertMirror, s), r)
     
  }
  it should "pass basic tests operArray horMirror" in {
    var s = "lVHt\nJVhv\nCSbg\nyeCt";
    var r = "yeCt\nCSbg\nJVhv\nlVHt";        
    testing(MovesInSquaredStrings.oper(MovesInSquaredStrings.horMirror, s), r);
    
  }
}

object MovesInSquaredStringsSpec {
  private def testing(actual: String, expect: String): Unit = {
    println("Actual: " + actual)
    println("Expect: " + expect)
    println("-")
    assertResult(expect){actual}
  }
}
