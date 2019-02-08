package com.github.mktdo.codewars

// https://www.codewars.com/kata/statistics-for-an-athletic-association/train/scala

object StatisticsForAnAthleticAssociation {
  def stat(strg: String): String = {
    import java.time.format.DateTimeFormatter
    import java.time.LocalTime
    val format = DateTimeFormatter.ofPattern("H|m|s")
    val displayFormat = DateTimeFormatter.ofPattern("HH|mm|ss")
    val parsedList = strg.split(", ").map(LocalTime.parse(_, format).toSecondOfDay().toLong).toList.sorted
    val range = LocalTime.MIN.plusSeconds(parsedList.max - parsedList.min)
    val ave = LocalTime.MIN.plusSeconds(parsedList.sum / parsedList.size)
    val mid = LocalTime.MIN.plusSeconds(if (parsedList.size % 2 == 1) parsedList(parsedList.size / 2)
      else (parsedList(parsedList.size / 2 - 1) + parsedList(parsedList.size / 2)) / 2)
    s"Range: ${range.format(displayFormat)} Average: ${ave.format(displayFormat)} Median: ${mid.format(displayFormat)}"
  }
}
