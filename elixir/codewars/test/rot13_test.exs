defmodule Rot13Test do
  use ExUnit.Case
  import Rot13, only: [rot13: 1]

  test "test" do
    assert "grfg" == rot13("test"), "Input: test , Expected Output: grfg , Actual Output: #{rot13("test")}"
  end
  
  test "Test" do
    assert "Grfg" == rot13("Test"), "Input: Test , Expected Output: Grfg , Actual Output: #{rot13("Test")}"
  end
end
