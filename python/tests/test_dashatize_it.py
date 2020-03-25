from codewars.dashatize_it import dashatize
from codewars.test import Test

class TestDashatizeIt(Test):
  def test_dashatize(self):
    self.describe('Basic')
    self.assert_equals(dashatize(274),"2-7-4", "Should return 2-7-4")
    self.assert_equals(dashatize(5311),"5-3-1-1", "Should return 5-3-1-1")
    self.assert_equals(dashatize(86320),"86-3-20", "Should return 86-3-20")
    self.assert_equals(dashatize(974302),"9-7-4-3-02", "Should return 9-7-4-3-02")
    self.describe('Weird')
    self.assert_equals(dashatize(None),"None", "Should return None");
    self.assert_equals(dashatize(0),"0", "Should return 0");
    self.assert_equals(dashatize(-1),"1", "Should return 1");
    self.assert_equals(dashatize(-28369),"28-3-6-9", "Should return 28-3-6-9");
