package com.github.mktdo.codewars

// https://www.codewars.com/kata/transportation-on-vacation/train/scala

object TransportationOnVacation {
  def cost(days: Int): Int = if (days >= 7) days * 40 - 50 else if (days >= 3) days * 40 - 20 else days * 40
}
