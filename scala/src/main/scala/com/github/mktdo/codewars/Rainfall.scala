package com.github.mktdo.codewars

object Rainfall {

  import scala.math.pow

  def convertStringToTownWeatherMap(str: String): Map[String, Array[Double]] = str.split("\n").map(_.split(":") match {
    case Array(t, data) => (t, data.split(",").map(_.split(" ")(1).toDouble))
  }).toMap

  def mean(town: String, strng: String): Double = convertStringToTownWeatherMap(strng).get(town) match {
    case Some(data) => data.sum / 12
    case None => -1.0
  }

  def variance(town: String, strng: String): Double = {
    val ave = mean(town, strng)
    convertStringToTownWeatherMap(strng).get(town) match {
      case Some(data) => data.map(d => pow(d - ave, 2)).sum / 12
      case None => -1.0
    }
  }
}
