from codewars.multiplication_tables import multiplication_table
from codewars.test import Test

class TestMultiplicationTables(Test):
  def test_multiplication_table(self):
    self.assert_equals(multiplication_table(2,2), [[1,2],[2,4]])
    self.assert_equals(multiplication_table(3,3), [[1,2,3],[2,4,6],[3,6,9]])
