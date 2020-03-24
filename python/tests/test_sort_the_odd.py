from codewars.test import Test
from codewars.sort_the_odd import sort_array

class TestSortTheOdd(Test):
  def test_sort_the_odd(self):
    self.assert_equals(sort_array([5, 3, 2, 8, 1, 4]), [1, 3, 2, 8, 5, 4])
    self.assert_equals(sort_array([5, 3, 1, 8, 0]), [1, 3, 5, 8, 0])
    self.assert_equals(sort_array([]),[])
