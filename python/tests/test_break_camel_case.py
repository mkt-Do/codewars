from codewars.break_camel_case import solution
from codewars.test import Test

class TestBreakCamelCase(Test):
  def test_solution(self):
    self.assert_equals(solution("helloWorld"), "hello World")
    self.assert_equals(solution("camelCase"), "camel Case")
    self.assert_equals(solution("breakCamelCase"), "break Camel Case")
