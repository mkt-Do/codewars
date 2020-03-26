from codewars.build_tower import tower_builder
from codewars.test import Test

class TestBuildTower(Test):
  def test_tower_builder(self):
    self.describe("Tests")
    self.it("Basic Tests")
    self.assert_equals(tower_builder(1), ['*', ])
    self.assert_equals(tower_builder(2), [' * ', '***'])
    self.assert_equals(tower_builder(3), ['  *  ', ' *** ', '*****'])
