from codewars.test import Test
from codewars.the_deaf_rats_of_hamelin import count_deaf_rats

class TestTheDeafRatsOfHamelin(Test):
  def test_count_deaf_rats(self):
    self.it("ex1")
    self.assert_equals(count_deaf_rats("~O~O~O~O P"), 0)
    self.it("ex2")
    self.assert_equals(count_deaf_rats("P O~ O~ ~O O~"), 1)
    self.it("ex3")
    self.assert_equals(count_deaf_rats("~O~O~O~OP~O~OO~"), 2)
