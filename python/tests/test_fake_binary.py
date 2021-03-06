from codewars.fake_binary import fake_bin
from codewars.test import Test

class TestFakeBinary(Test):
  def test_fake_bin(self):
    self.describe("Example Tests")
    tests = [
      # [expected, input]
      ["01011110001100111", "45385593107843568"],
      ["101000111101101", "509321967506747"],
      ["011011110000101010000011011", "366058562030849490134388085"],
      ["01111100", "15889923"],
      ["100111001111", "800857237867"],
    ]
    for exp, inp in tests:
      self.assert_equals(fake_bin(inp), exp)
