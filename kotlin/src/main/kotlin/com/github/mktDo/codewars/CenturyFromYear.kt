package com.github.mktDo.codewars

object CenturyFromYear {
    fun century(number: Int): Int {
        return if (number % 100 == 0) number / 100 else number / 100 + 1
    }
}
