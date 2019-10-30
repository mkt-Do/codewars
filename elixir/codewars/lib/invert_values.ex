defmodule InvertValues do
  def invert(list), do: list |> Enum.map(fn(x) -> -x end)
end
