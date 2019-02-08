package com.github.mktdo.codewars

import org.scalatest.FunSpec

class ExampleTests extends FunSpec {
  describe("Mumbling.accum") {
    it("should work with example tests") {
      assertResult ("Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu") {Mumbling.accum("ZpglnRxqenU")}
      assertResult ("N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb") {Mumbling.accum("NyffsGeyylB")}
      assertResult ("M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu") {Mumbling.accum("MjtkuBovqrU")}
      assertResult ("E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm") {Mumbling.accum("EvidjUnokmM")}
      assertResult ("H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc") {Mumbling.accum("HbideVbxncC")}
    }
  }
}
