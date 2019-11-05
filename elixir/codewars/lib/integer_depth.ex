defmodule IntegerDepth do
  def compute_depth(n) do
    rec(n, %{}, 1)
  end
  def rec(_, %{"0" => 1, "1" => 1, "2" => 1, "3" => 1, "4" => 1, "5" => 1, "6" => 1, "7" => 1, "8" => 1, "9" => 1}, cnt), do: cnt - 1
  def rec(n, map, cnt) do
    res = n * cnt
      |> Integer.to_string
      |> String.split("")
      |> Enum.filter(fn c -> c != "" end)
      |> Enum.reduce(%{}, fn(c, acc) -> Map.merge(acc, %{c => 1}) end)
      |> Map.merge(map)
    rec(n, res, cnt + 1)
  end
end
