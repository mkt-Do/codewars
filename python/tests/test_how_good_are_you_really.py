from codewars.how_good_are_you_really import better_than_average
from codewars.test import Test

class TestHowGoodAreYouReally(Test):
  def test_better_than_average(self):
    self.describe("Basic Tests")
    self.it("better_than_average([2, 3], 5) should return True")
    self.assert_equals(better_than_average([2, 3], 5), True)
    self.it("better_than_average([100, 40, 34, 57, 29, 72, 57, 88], 75) should return True")
    self.assert_equals(better_than_average([100, 40, 34, 57, 29, 72, 57, 88], 75), True)
    self.it("better_than_average([12, 23, 34, 45, 56, 67, 78, 89, 90], 69) should return True")
    self.assert_equals(better_than_average([12, 23, 34, 45, 56, 67, 78, 89, 90], 69), True)
