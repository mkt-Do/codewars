from codewars.probabilities_for_sums_in_rolling_cubic_dice import rolldice_sum_prob
from codewars.test import Test

class TestProbabilitiesForSumsInRollingCubicDice(Test):
  def test_rolldice_sum_prob(self):
    self.assertFuzzyEquals(rolldice_sum_prob(11, 2), 0.055555555555)
    self.assertFuzzyEquals(rolldice_sum_prob(8, 2), 0.13888888889)
    self.assertFuzzyEquals(rolldice_sum_prob(8, 3),0.0972222222222)

  def assertFuzzyEquals(self, actual, expected, msg=""):
    import math
    # max error
    merr = 1e-10
    if expected == 0:
      inrange = math.fabs(actual) <= merr
    else:
      inrange = math.fabs((actual - expected) / expected) <= merr
    if msg == "":
      msg = "Expected value near {:.10f}, but got {:.10f}"
      msg = msg.format(expected, actual)
    return self.expect(inrange, msg)
