from codewars.sum_of_numbers_from_0_to_N import show_sequence
from codewars.test import Test

class TestSumOfNumbersFrom0ToN(Test):
  def test_show_sequence(self):
    self.describe("Example Tests")
    tests = (
      (6, "0+1+2+3+4+5+6 = 21"),
      (7, "0+1+2+3+4+5+6+7 = 28"),
      (0, "0=0"),
      (-1, "-1<0"),
      (-10, "-10<0"),
    )
    for inp, exp in tests:
      self.assert_equals(show_sequence(inp), exp)
