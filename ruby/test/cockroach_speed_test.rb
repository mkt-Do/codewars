require "minitest/autorun"
require "./lib/cockroach_speed"

class TestCockroachSpeed < MiniTest::Test
  def test_cockroach_speed
    assert_equal(cockroach_speed(1.08),30)
    assert_equal(cockroach_speed(1.09),30)
    assert_equal(cockroach_speed(0),0)
  end
end
