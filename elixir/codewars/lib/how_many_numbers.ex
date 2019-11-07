defmodule HowManyNumbers do

  def sel_number(n, d) do
    0..n |> Enum.map(fn x -> rec(x, []) end) |> Enum.filter(fn ar -> check(ar, d) end) |> length
  end
  defp rec(0, res), do: res
  defp rec(n, res), do: rec(div(n, 10), [rem(n, 10)] ++ res)
  defp check([], _), do: false
  defp check([_], _), do: false
  defp check([h, t], d), do: h < t && t - h <= d
  defp check([f, s | r], d), do: f < s && s - f <= d && check([s] ++ r, d)
end

