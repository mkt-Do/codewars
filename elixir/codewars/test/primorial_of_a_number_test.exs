defmodule PrimorialOfANumberTest do
  use ExUnit.Case

  defp testing(n, exp) do
    a = PrimorialOfANumber.num_primorial(n)
    assert a == exp, "Given number #{n}, expected #{exp}, got #{a}"
  end
  
  test "Basic tests" do
    testing(3, 30)
    testing(4, 210)
    testing(5, 2310)
    testing(8, 9699690)
    testing(9, 223092870)
  end
end
