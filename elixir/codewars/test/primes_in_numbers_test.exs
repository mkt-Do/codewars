defmodule PrimesInNumbersTest do
  
  use ExUnit.Case

  defp dotest(numtest, n, ans) do 
    IO.puts("Test #{numtest}")
    assert PrimesInNumbers.prime_factors(n) == ans
  end
  
  test "prime_factors" do 
    dotest(1, 7775460, "(2**2)(3**3)(5)(7)(11**2)(17)")
    dotest(2, 7919, "(7919)")
    dotest(3, 17*17*93*677, "(3)(17**2)(31)(677)")
    dotest(4, 933555431, "(7537)(123863)")
    dotest(5, 342217392, "(2**4)(3)(11)(43)(15073)")
  end
  
end
