from codewars.maximum_subarray_sum import max_sequence
from codewars.test import Test

class TestMaximumSubarraySum(Test):
  def test_max_sequence(self):
    self.describe("Tests")
    self.it('should work on an empty array')
    self.assert_equals(max_sequence([]), 0)
    self.it('should work on the example')
    self.assert_equals(max_sequence([-2, 1, -3, 4, -1, 2, 1, -5, 4]), 6)
