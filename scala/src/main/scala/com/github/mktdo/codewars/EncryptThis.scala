package com.github.mktdo.codewars

object EncryptThis {
  def switchString(str: String): String = if (str.isEmpty || str.tail.isEmpty) str else str.last + str.tail.init + str.head
  def encryptThis(text: String): String = text.split(" ").collect { case str if !str.isEmpty => str.head.toInt.toString + switchString(str.tail) }.mkString(" ")
}
