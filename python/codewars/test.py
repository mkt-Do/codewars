import unittest

class Test(unittest.TestCase):
  """
  Test Class(Emulate Codewars Test Class)
  """

  def assert_equals(self, actual, expected, msg=None):
    """
    Checks that the actual value equals the expected value.
    If the test doesn't pass, an (optional) specified message is displayed.
    The default message is `{actual} should be {expected}`
    """
    if msg is None:
      msg = "{actual} should be {expected}".format(actual=actual, expected=expected)
    self.assertEqual(actual, expected, msg=msg)

  def assert_not_equals(self, actual, unexpected, msg=None):
    """
    Checks that the actual value equals the expected value.
    If the test doesn't pass an (optional) specified message is displayed.
    The default message is `{actual} should be {unexpected}`
    """
    if msg is None:
      msg = "{actual} should be {unexpected}".format(actual=actual, unexpected=unexpected)
    self.assertNotEqual(actual, unexpected, msg=msg)

  def expect_error(self, msg, thunk):
    """
    Takes a message and a thunk, or unevaluated function.
    If the thunk throws an error, this test passes. Otherwise this test fails and prints the specified message.
    """
    with self.assertRaises(Exception, msg=msg):
      thunk()

  def expect(self, passed, msg="Value is not what was expected"):
    """
    Checks to see if the value passed evaluates to some truthy value.
    Prints an optional message if provided when the test fails.
    """
    self.assertTrue(passed, msg=msg)

  def describe(self, msg):
    """
    Top level method for describing/grouping a set of tests.
    But this emulated function is only printing message.
    """
    print(msg)

  def it(self, msg):
    """
    Subgroups tests.
    Useful for printing lots of details on how you are testing.
    But this emulated function is equal describe method.
    """
    print(msg)
