defmodule MaximumMultiple do
  def max_multiple(divisor, bound) do
    ls = Stream.iterate(divisor, &(&1 + divisor)) |> Enum.take_while(&(&1 <= bound)) |> Enum.reverse
    if Enum.empty?(ls) do
      0
    else
      hd(ls)
    end
  end
end
