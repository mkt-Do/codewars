defmodule ClosestAndSmallest do

  def closest(""), do: [{}, {}]
  def closest(s) do
    String.split(s, " ")
      |> Enum.with_index
      |> Enum.map(fn ({sn, i}) ->
        {
          String.split(sn, "")
            |> Enum.filter(&(&1 != ""))
            |> Enum.map(&(String.to_integer(&1)))
            |> Enum.sum,
            i,
            String.to_integer(sn)
        } end)
      |> Enum.sort(fn ({w1, i1, _}, {w2, i2, _}) -> if w1 == w2, do: i1 < i2, else: w1 < w2 end)
      |> Enum.chunk_every(2, 1)
      |> Enum.filter(&(length(&1) == 2))
      |> Enum.reduce([], fn([v1, v2], acc) ->
        cond do
          acc == [] -> [v1, v2]
          true -> if abs(elem(v1, 0) - elem(v2, 0)) < abs(elem(Enum.at(acc, 0), 0) - elem(Enum.at(acc, 1), 0)), do: [v1, v2], else: acc
        end
      end)
  end
end
