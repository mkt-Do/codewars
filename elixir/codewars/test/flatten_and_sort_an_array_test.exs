defmodule FlattenAndSortAnArrayTest do
  use ExUnit.Case

  test "basic cases" do
    assert FlattenAndSortAnArray.solution([[]]) == []
    assert FlattenAndSortAnArray.solution([[1]]) == [1]
    assert FlattenAndSortAnArray.solution([[1, 2]]) == [1, 2]
    assert FlattenAndSortAnArray.solution([[], []]) == []
    assert FlattenAndSortAnArray.solution([[], [1]]) == [1]
    assert FlattenAndSortAnArray.solution([[1], [2]]) == [1, 2]
  end
  
  test "more advanced cases" do
    assert FlattenAndSortAnArray.solution([[10, -10], [0]]) == [-10, 0, 10]
    assert FlattenAndSortAnArray.solution([[4, 3, 2, 1]]) == [1, 2, 3, 4]
    assert FlattenAndSortAnArray.solution([[4, 3], [1, 2]]) == [1, 2, 3, 4]
    assert FlattenAndSortAnArray.solution([[], [1], [], [3, 2]]) == [1, 2, 3]
  end
end
