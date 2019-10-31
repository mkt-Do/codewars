defmodule CountByX do
  def count_by(x, n), do: Stream.iterate(x, &(&1 + x)) |> Enum.take(n)
end
