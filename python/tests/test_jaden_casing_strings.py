from codewars.jaden_casing_strings import to_jaden_case
from codewars.test import Test

class TestJadenCasingStrings(Test):
  def test_to_jaden_case(self):
    quote = "How can mirrors be real if our eyes aren't real"
    self.assert_equals(to_jaden_case(quote), "How Can Mirrors Be Real If Our Eyes Aren't Real")
