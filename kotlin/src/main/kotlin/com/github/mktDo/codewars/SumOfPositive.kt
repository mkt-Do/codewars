package com.github.mktDo.codewars

object SumOfPositive {
    fun sum(numbers: IntArray): Int {
        return numbers.filter{ it > 0 }.sum()
    }
}
