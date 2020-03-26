from codewars.test import Test
from codewars.word_a_10n import abbreviate

class TestWordA10N(Test):
  def test_abbreviate(self):
    self.assert_equals(abbreviate("internationalization"), "i18n")
    self.assert_equals(abbreviate("accessibility"), "a11y")
    self.assert_equals(abbreviate("Accessibility"), "A11y")
    self.assert_equals(abbreviate("elephant-ride"), "e6t-r2e")
