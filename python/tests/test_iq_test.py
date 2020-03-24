from codewars.iq_test import iq_test
from codewars.test import Test

class TestIQTest(Test):
  def test_iq_test(self):
    self.assert_equals(iq_test("2 4 7 8 10"),3)
    self.assert_equals(iq_test("1 2 2"), 1)
