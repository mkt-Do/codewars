from codewars.test import Test
from codewars.find_the_stray_number import stray

class TestFindTheStrayNumber(Test):
  def test_find_the_stray_number(self):
    self.assert_equals(stray([1, 1, 1, 1, 1, 1, 2]), 2)
    self.assert_equals(stray([2, 3, 2, 2, 2]), 3)
    self.assert_equals(stray([3, 2, 2, 2, 2]), 3)
