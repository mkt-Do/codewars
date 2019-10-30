defmodule OppositeNumberTest do
  use ExUnit.Case

  test "returns a number's opposite" do
    assert OppositeNumber.opposite(1) === -1
  end
end
