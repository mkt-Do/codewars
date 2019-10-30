defmodule SumOfOdd do
  def drop_elms([], res) do
    res
  end
  def drop_elms([h | t], res) do
    drop_elms(t, Enum.drop(res, h))
  end
  def row_sum_odd_numbers(n) do
    nums = Stream.iterate(1, &(&1 + 1)) |> Enum.take(n)
    odds = Stream.iterate(1, &(&1 + 2)) |> Enum.take(Enum.sum(nums))
    dropper = nums |> Enum.reverse |> tl |> Enum.reverse
    drop_elms(dropper, odds) |> Enum.sum
  end
end
