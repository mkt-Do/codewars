defmodule BestTravel do
  
  def best_sum(t, k, ls) do
    if length(ls) < k do
      nil
    else
      res = rec(ls, k) |> Enum.filter(fn x -> x <= t end)
      if Enum.empty?(res), do: nil, else: Enum.max(res)
    end
  end
  def rec(ls, 1), do: ls
  def rec([], _), do: []
  def rec(ls, n) do
    a1 = rec(tl(ls), n)
    a2 = rec(tl(ls), n - 1) |> Enum.map(fn x -> x + hd(ls) end)
    a1 ++ a2
  end
end
