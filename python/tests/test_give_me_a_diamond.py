from codewars.give_me_a_diamond import diamond
from codewars.test import Test

class TestGiveMeADiamond(Test):
  def test_diamond(self):
    expected =  " *\n"
    expected += "***\n"
    expected += " *\n"
    self.assert_equals(diamond(1), "*\n")
    self.assert_equals(diamond(2), None)
    self.assert_equals(diamond(3), expected)
    self.assert_equals(diamond(5), "  *\n ***\n*****\n ***\n  *\n")
    self.assert_equals(diamond(0), None)
    self.assert_equals(diamond(-3), None)
