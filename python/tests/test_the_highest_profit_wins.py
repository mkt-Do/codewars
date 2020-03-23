from codewars.test import Test
from codewars.the_highest_profit_wins import min_max
from random import randint, shuffle

class TestTheHighestProfitWins(Test):
  def test(self):
    self.describe("min_max")
    self.it("should work for some examples")
    lst = [1, 2, 3, 4, 5]
    self.assert_equals(min_max(lst), [1, 5], "tested on " + str(lst))
    lst = [2334454, 5]
    self.assert_equals(min_max(lst), [5, 2334454], "tested on " + str(lst))
    for i in range(0, 20):
      r = randint(0, 100)
      lst = [r]
      self.assert_equals(min_max(lst), [r, r], "tested on " + str(lst))

