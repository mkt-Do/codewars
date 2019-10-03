package com.github.mktdo.codewars

import org.scalatest._

class CountingDuplicatesSpec extends FlatSpec with Matchers {

  "duplicateCount(\"abcde\")" should "return 0" in {
    CountingDuplicates.duplicateCount("abcde") should be (0)
  }
  
  "duplicateCount(\"abcdea\")" should "return 1" in {
    CountingDuplicates.duplicateCount("abcdea") should be (1)
  }
  
  "duplicateCount(\"indivisibility\")" should "return 1" in {
    CountingDuplicates.duplicateCount("indivisibility") should be (1)
  }
}
