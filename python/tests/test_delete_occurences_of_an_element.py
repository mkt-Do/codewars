from codewars.delete_occurrences_of_an_element import delete_nth
from codewars.test import Test

class TestDeleteOccurrencesOfAnElement(Test):
  def test_delete_nth(self):
    self.assert_equals(delete_nth([20,37,20,21], 1), [20,37,21])
    self.assert_equals(delete_nth([1,1,3,3,7,2,2,2,2], 3), [1, 1, 3, 3, 7, 2, 2, 2])
