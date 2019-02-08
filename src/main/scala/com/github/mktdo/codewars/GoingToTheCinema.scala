package com.github.mktdo.codewars

// https://www.codewars.com/kata/going-to-the-cinema/train/scala

object GoingToTheCinema {
  def movie(card: Int, ticket: Int, perc: Double): Int = {
    import scala.math.{ ceil, pow }
    def rec(cards: Double, ticks: Int, count: Int = 0): Int =
      if (ceil(cards) < ticks) count
      else rec(cards + ticket * pow(perc, count + 1), ticks + ticket, count + 1)
    rec(card.toDouble, 0)
  }
}
