defmodule FormatStringOfNames do
  def list(people), do: rec(people, "")
  def rec([], ""), do: ""
  def rec([], res), do: res
  def rec([h], ""), do: Map.get(h, :name)
  def rec([h], res), do: res <> " & " <> Map.get(h, :name)
  def rec([h | t], ""), do: rec(t, Map.get(h, :name))
  def rec([h | t], res), do: rec(t, res <> ", " <> Map.get(h, :name))
end
