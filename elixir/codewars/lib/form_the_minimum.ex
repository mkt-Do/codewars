defmodule FormTheMinimum do
  def minValue(numbers) do
    vals = numbers |> Enum.uniq |> Enum.sort |> Enum.reverse
    0..(length(vals) - 1) |> Enum.reduce(0, fn (v, acc) -> acc + round(:math.pow(10, v)) * Enum.at(vals, v) end)
  end
end
