from codewars.multitap_keypad_text_entry_on_old_mobile_phone import presses
from codewars.test import Test

class TestMultitapKeypadTextEntryOnOldMobilePhone(Test):
  def test_presses(self):
    self.assert_equals(presses("LOL"), 9)
    self.assert_equals(presses("HOW R U"), 13)
