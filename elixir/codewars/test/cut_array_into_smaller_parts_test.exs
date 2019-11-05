defmodule CutArrayIntoSmallerPartsTest do
  use ExUnit.Case

  test "Basic Tests" do
    assert CutArrayIntoSmallerParts.make_parts([1,2,3], 1) == [[1],[2],[3]]
    assert CutArrayIntoSmallerParts.make_parts([1,2,3,4,5], 10) == [[1,2,3,4,5]]
    assert CutArrayIntoSmallerParts.make_parts([], 10) == []
    assert CutArrayIntoSmallerParts.make_parts([1,2,3,4,5], 2) == [[1,2],[3,4],[5]]
    assert CutArrayIntoSmallerParts.make_parts([1,2,3,4,5], 3) == [[1,2,3],[4,5]]
  end
end
