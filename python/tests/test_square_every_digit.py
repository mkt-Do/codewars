from codewars.square_every_digit import square_digits
from codewars.test import Test

class TestSquareEveryDigit(Test):
  def test_square_every_digit(self):
    self.assert_equals(square_digits(9119), 811181)
