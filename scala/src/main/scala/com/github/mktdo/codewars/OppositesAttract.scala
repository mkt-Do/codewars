package com.github.mktdo.codewars

// https://www.codewars.com/kata/opposites-attract/train/scala

object OppositesAttract {
  def lovefunc(flower1: Int, flower2: Int): Boolean = (flower1 % 2 ^ flower2 % 2) == 1
}
