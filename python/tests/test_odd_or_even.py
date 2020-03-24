from codewars.odd_or_even import odd_or_even
from codewars.test import Test

class TestOddOrEven(Test):
  def test_odd_or_even(self):
    self.assert_equals(odd_or_even([0, 1, 2]), "odd")
    self.assert_equals(odd_or_even([0, 1, 3]), "even")
    self.assert_equals(odd_or_even([1023, 1, 2]), "even")
