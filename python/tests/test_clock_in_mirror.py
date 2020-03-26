from codewars.clock_in_mirror import what_is_the_time
from codewars.test import Test

class TestClockInMirror(Test):
  def test_what_is_the_time(self):
    self.describe("works for some examples")
    self.assert_equals(what_is_the_time("06:35"), "05:25", "didn't work for '06:35'")
    self.assert_equals(what_is_the_time("11:59"), "12:01", "didn't work for '11:59'")
    self.assert_equals(what_is_the_time("12:02"), "11:58", "didn't work for '12:02'")
    self.assert_equals(what_is_the_time("04:00"), "08:00", "didn't work for '04:00'")
    self.assert_equals(what_is_the_time("06:00"), "06:00", "didn't work for '06:00'")
    self.assert_equals(what_is_the_time("12:00"), "12:00", "didn't work for '12:00'")
    print("<COMPLETEDIN::>")
    self.describe("returns the original time when applied twice to a time")

    from random import randint
    def rand_time():
      return "{:02}:{:02}".format(randint(1, 12), randint(0, 59))
    for i in range(10):
      time = rand_time()
      self.assert_equals(what_is_the_time(what_is_the_time(time)), time, "didn't work for "+ time)
    print("<COMPLETEDIN::>")
