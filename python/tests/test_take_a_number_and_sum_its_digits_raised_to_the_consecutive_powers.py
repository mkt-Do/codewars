from codewars.take_a_number_and_sum_its_digits_raised_to_the_consecutive_powers import sum_dig_pow
from codewars.test import Test

class TestTakeANumberAndSumItsDigitsRaisedToTheConsecutivePowers(Test):
  def test_sum_dig_pow(self):
    self.describe("Example Tests")
    self.assert_equals(sum_dig_pow(1, 10), [1, 2, 3, 4, 5, 6, 7, 8, 9])
    self.assert_equals(sum_dig_pow(1, 100), [1, 2, 3, 4, 5, 6, 7, 8, 9, 89])
    self.assert_equals(sum_dig_pow(10, 89),  [89])
    self.assert_equals(sum_dig_pow(10, 100),  [89])
    self.assert_equals(sum_dig_pow(90, 100), [])
    self.assert_equals(sum_dig_pow(89, 135), [89, 135])
