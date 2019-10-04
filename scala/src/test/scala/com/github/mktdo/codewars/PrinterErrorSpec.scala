package com.github.mktdo.codewars

import org.scalatest.FunSuite

class PrinterErrorSpec extends FunSuite {

  test("Sample") {
    assert(PrinterError.printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz") === "3/56")
  }
}
