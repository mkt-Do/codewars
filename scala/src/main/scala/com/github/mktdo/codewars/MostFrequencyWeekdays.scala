package com.github.mktdo.codewars

import java.util.Locale
import java.time.{ DayOfWeek, LocalDate }
import java.time.format.TextStyle

object MostFrequencyWeekdays {
  def mostFrequentDays(year: Int): List[String] = {
    val yearFirstWeekDay = LocalDate.of(year, 1, 1).getDayOfWeek
    val yearLastWeekDay = LocalDate.of(year, 12, 31).getDayOfWeek
    def rotate(weeks: Array[DayOfWeek]): Array[DayOfWeek] = if (weeks.head == yearFirstWeekDay) weeks else rotate(weeks.tail :+ weeks.head)
    val weeks = rotate(DayOfWeek.values)
    DayOfWeek.values.withFilter(d => weeks.take(weeks.indexOf(yearLastWeekDay) + 1).contains(d)).map(_.getDisplayName(TextStyle.FULL, Locale.ENGLISH)).toList
  }
}
