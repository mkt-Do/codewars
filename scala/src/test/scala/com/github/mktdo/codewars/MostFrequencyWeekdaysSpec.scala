package com.github.mktdo.codewars

import org.scalatest.FlatSpec

class MostFrequencyWeekdaysSpec extends FlatSpec {
  it should "work with example tests" in {
    assert(MostFrequencyWeekdays.mostFrequentDays(2427) == List("Friday"))
    assert(MostFrequencyWeekdays.mostFrequentDays(2185) == List("Saturday"))
    assert(MostFrequencyWeekdays.mostFrequentDays(1084) == List("Tuesday", "Wednesday"))
    assert(MostFrequencyWeekdays.mostFrequentDays(1167) == List("Sunday"))
    assert(MostFrequencyWeekdays.mostFrequentDays(1216) == List("Friday", "Saturday"))
    assert(MostFrequencyWeekdays.mostFrequentDays(1492) == List("Friday", "Saturday"))
    assert(MostFrequencyWeekdays.mostFrequentDays(1770) == List("Monday"))
    assert(MostFrequencyWeekdays.mostFrequentDays(1785) == List("Saturday"))
    assert(MostFrequencyWeekdays.mostFrequentDays(212)  == List("Wednesday", "Thursday"))
    assert(MostFrequencyWeekdays.mostFrequentDays(1)    == List("Monday"))
  }
}
