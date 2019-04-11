package com.github.mktdo.codewars

// https://www.codewars.com/kata/dubstep/train/scala

object Dubstep {
  def songDecoder(song: String): String = song.split("WUB").filter(_ != "").mkString(" ")
}
