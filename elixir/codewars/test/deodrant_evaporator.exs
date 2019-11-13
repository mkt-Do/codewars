defmodule DeodrantEvaporatorTest do
  
  use ExUnit.Case

  test "Evaporator" do
    IO.puts("evaporator")
    IO.puts("Test 1")
    assert DeodrantEvaporator.evaporator(10, 10, 10) == 22
    IO.puts("Test 2")
		assert DeodrantEvaporator.evaporator(10, 10, 5) == 29
  end
end
