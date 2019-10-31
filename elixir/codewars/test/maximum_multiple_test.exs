defmodule MaximumMultipleTest do
  use ExUnit.Case

  defp testing(d, b, e) do
    a = MaximumMultiple.max_multiple(d, b)
    m = """
Given: Divisor #{d}, Bound #{b}
Actual: #{a}
Expected: #{e}
"""
    assert a == e, m
  end

  test "fixed tests" do
    testing(2, 7, 6)
    testing(3, 10, 9)
    testing(7, 17, 14)
    testing(10, 50, 50)
    testing(37, 200, 185)
    testing(7, 100, 98)
    testing(37, 100, 74)
    testing(1, 13, 13)
    testing(1, 1, 1)
    testing(4, 1, 0)
  end
end
