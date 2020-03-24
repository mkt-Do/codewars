from codewars.string_incrementer import increment_string
from codewars.test import Test

class TestStringIncrementer(Test):
  def test_increment_string(self):
    self.assert_equals(increment_string("foo"), "foo1")
    self.assert_equals(increment_string("foobar001"), "foobar002")
    self.assert_equals(increment_string("foobar1"), "foobar2")
    self.assert_equals(increment_string("foobar00"), "foobar01")
    self.assert_equals(increment_string("foobar99"), "foobar100")
    self.assert_equals(increment_string("foobar099"), "foobar100")
    self.assert_equals(increment_string(""), "1")
