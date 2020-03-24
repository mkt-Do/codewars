from codewars.test import Test
from codewars.unique_in_order import unique_in_order

class TestUniqueInOrder(Test):
  def test_unique_in_order(self):
    self.assert_equals(unique_in_order('AAAABBBCCDAABBB'), ['A','B','C','D','A','B'])
