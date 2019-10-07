package com.github.mktdo.codewars

import org.scalatest._

class ConcatMaybeSpec extends FlatSpec {
  it should "work with example tests" in {
    assert(ConcatMaybe.concatOption(Some("Hello"), Some("World")) == Some("Hello World"))
    assert(ConcatMaybe.concatOption(Some("Hello"), None) == None)
    assert(ConcatMaybe.concatOption(None, Some("World")) == None)
  }
}
