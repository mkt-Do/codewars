defmodule MessiGoalsFunctionTest do
  use ExUnit.Case
  
  defp testing(a, b, c, e) do
    ac = MessiGoalsFunction.goals(a, b, c)
    assert ac == e, "Given numbers #{a}, #{b}, and #{c}: Expected #{e}, got #{ac}"
  end

  test "fixed tests" do
    testing(0, 0, 0, 0)
    testing(43, 10, 5, 58)
  end
end
