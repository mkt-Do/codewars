defmodule Pentabonacci do

  def count_odd_pentaFib(0), do: 0
  def count_odd_pentaFib(1), do: 1
  def count_odd_pentaFib(2), do: 1
  def count_odd_pentaFib(3), do: 1
  def count_odd_pentaFib(4), do: 1
  def count_odd_pentaFib(n), do: count_odd_pentaFib(n, [4, 2, 1, 1, 0])
  def count_odd_pentaFib(4, res), do: Enum.filter(res, &(rem(&1, 2) == 1)) |> Enum.uniq |> length
  def count_odd_pentaFib(n, res), do: count_odd_pentaFib(n - 1, [Enum.take(res, 5) |> Enum.sum] ++ res)
end
