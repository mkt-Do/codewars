from codewars.remove_the_minimum import remove_smallest
from codewars.test import Test

class TestRemoveTheMinumum(Test):
  def test_remove_smallest(self):
    self.describe("remove_smallest")
    self.it("works for the examples")
    self.assert_equals(remove_smallest([1, 2, 3, 4, 5]), [2, 3, 4, 5], "Wrong result for [1, 2, 3, 4, 5]")
    self.assert_equals(remove_smallest([5, 3, 2, 1, 4]), [5, 3, 2, 4], "Wrong result for [5, 3, 2, 1, 4]")
    self.assert_equals(remove_smallest([1, 2, 3, 1, 1]), [2, 3, 1, 1], "Wrong result for [1, 2, 3, 1, 1]")
    self.assert_equals(remove_smallest([]), [], "Wrong result for []")

    from numpy.random import randint
    def randlist():
      return list(randint(400, size=randint(1, 10)))

    self.it("returns [] if list has only one element")
    for i in range(10):
      x = randint(1, 400)
      self.assert_equals(remove_smallest([x]), [], "Wrong result for [{}]".format(x))
    
    self.it("returns a list that misses only one element")
    for i in range(10):
      arr = randlist()
      self.assert_equals(len(remove_smallest(arr[:])), len(arr) - 1, "Wrong sized result for {}".format(arr))
