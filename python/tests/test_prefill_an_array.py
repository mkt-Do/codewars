from codewars.prefill_an_array import prefill
from codewars.test import Test

class TestPrefillAnArray(Test):
  def test_prefill(self):
    self.assert_equals(prefill(3,1), [1,1,1])
    self.assert_equals(prefill(2,'abc'), ['abc','abc'])
    self.assert_equals(prefill('1',1), [1])
    self.assert_equals(prefill(3, prefill(2,'2d')), [['2d','2d'],['2d','2d'],['2d','2d']])
    try:
      prefill('xyz', 1)
    except TypeError as err:
      self.assert_equals(str(err), "xyz is invalid")
