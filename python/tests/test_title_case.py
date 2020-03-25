from codewars.test import Test
from codewars.title_case import title_case

class TestTitleCase(Test):
  def test_title_case(self):
    self.assert_equals(title_case(''), '')
    self.assert_equals(title_case('a clash of KINGS', 'a an the of'), 'A Clash of Kings')
    self.assert_equals(title_case('THE WIND IN THE WILLOWS', 'The In'), 'The Wind in the Willows')
    self.assert_equals(title_case('the quick brown fox'), 'The Quick Brown Fox')
