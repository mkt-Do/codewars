package com.github.mktdo.codewars

object PrinterError {
  def printerError(s: String): String = s"${s.filter(('n' to 'z').contains(_)).size}/${s.length}"
}
