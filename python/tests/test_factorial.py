from codewars.factorial import factorial
from codewars.test import Test

class TestFactorial(Test):
  def test_factorial(self):
    self.assert_equals(factorial(0), 1, "factorial for 0 is 1");
    self.assert_equals(factorial(1), 1, "factorial for 1 is 1");
    self.assert_equals(factorial(2), 2, "factorial for 2 is 2");
    self.assert_equals(factorial(3), 6, "factorial for 3 is 6");
