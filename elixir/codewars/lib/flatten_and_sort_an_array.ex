defmodule FlattenAndSortAnArray do
  def solution(ls), do: ls |> Enum.flat_map(&(&1)) |> Enum.sort
end
