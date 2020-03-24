from codewars.test import Test
from codewars.who_likes_it import likes

class TestWhoLikesIt(Test):
  def test_likes(self):
    self.assert_equals(likes([]), 'no one likes this')
    self.assert_equals(likes(['Peter']), 'Peter likes this')
    self.assert_equals(likes(['Jacob', 'Alex']), 'Jacob and Alex like this')
    self.assert_equals(likes(['Max', 'John', 'Mark']), 'Max, John and Mark like this')
    self.assert_equals(likes(['Alex', 'Jacob', 'Mark', 'Max']), 'Alex, Jacob and 2 others like this')
