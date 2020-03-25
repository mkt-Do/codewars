from codewars.count_characters_in_your_string import count
from codewars.test import Test

class TestCountCharactersInYourString(Test):
  def test_count(self):
    self.assert_equals(count('aba'), {'a': 2, 'b': 1})
    self.assert_equals(count(''), {})
