from codewars.sum_without_highest_and_lowest_number import sum_array
from codewars.test import Test

class TestSumWithoutHighestAndLowestNumber(Test):
  def test_sum_array(self):
    self.describe("Basic tests")
    self.it("None or Empty")
    self.assert_equals(sum_array(None), 0)
    self.assert_equals(sum_array([]), 0)
    self.it("Only one Element")
    self.assert_equals(sum_array([3]), 0)
    self.assert_equals(sum_array([-3]), 0)
    self.it("Only two Element")
    self.assert_equals(sum_array([ 3, 5]), 0)
    self.assert_equals(sum_array([-3, -5]), 0)
    self.it("Real Tests")
    self.assert_equals(sum_array([6, 2, 1, 8, 10]), 16)
    self.assert_equals(sum_array([6, 0, 1, 10, 10]), 17)
    self.assert_equals(sum_array([-6, -20, -1, -10, -12]), -28)
    self.assert_equals(sum_array([-6, 20, -1, 10, -12]), 3)
