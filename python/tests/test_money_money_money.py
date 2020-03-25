from codewars.money_money_money import calculate_years
from codewars.test import Test

class TestMoneyMoneyMoney(Test):
  def test_calculate_years(self):
    self.describe("calculate_years")
    self.it("works for some examples")
    self.assert_equals(calculate_years(1000, 0.05, 0.18, 1100), 3)
    self.assert_equals(calculate_years(1000,0.01625,0.18,1200), 14)
    self.assert_equals(calculate_years(1000,0.05,0.18,1000), 0)
