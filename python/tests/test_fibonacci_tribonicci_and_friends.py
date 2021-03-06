from codewars.fibonacci_tribonicci_and_friends import Xbonacci
from codewars.test import Test

class TestFibonacciTribonicciAndFriends(Test):
  def test_Xbonacci(self):
    self.describe("Basic tests")
    self.assert_equals(Xbonacci([0,1],10),[0,1,1,2,3,5,8,13,21,34])
    self.assert_equals(Xbonacci([1,1],10),[1,1,2,3,5,8,13,21,34,55])
    self.assert_equals(Xbonacci([0,0,0,0,1],10),[0,0,0,0,1,1,2,4,8,16])
    self.assert_equals(Xbonacci([1,0,0,0,0,0,1],10),[1,0,0,0,0,0,1,2,3,6])
    self.assert_equals(Xbonacci([1,0,0,0,0,0,0,0,0,0],20),[1,0,0,0,0,0,0,0,0,0,1,1,2,4,8,16,32,64,128,256])

