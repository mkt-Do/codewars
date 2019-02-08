package com.github.mktdo.codewars

// https://www.codewars.com/kata/bouncing-balls/train/scala

object BouncingBall {
  def bouncingBall(h: Double, bounce: Double, window: Double): Int = {
    def bounceTime(height: Double, time: Int = 0): Int = if (height < window) time
      else {
        val nextHeight = height * bounce
        if (nextHeight > window) bounceTime(nextHeight, time + 2) else bounceTime(nextHeight, time + 1)
      }
    if (bounce <= 0 || bounce >= 1) -1
    else if (h < 0) -1
    else if (window >= h) -1
    else bounceTime(h)
  }
}
