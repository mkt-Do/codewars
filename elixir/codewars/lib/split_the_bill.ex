defmodule SplitTheBill do
  def split_the_bill(group) do
    sum = Map.values(group) |> Enum.sum
    len = length(Map.values(group))
    avg = sum / len
    rec = fn
      [], map, _ -> map
      keys, map, f -> f.(tl(keys), Map.put(map, hd(keys), Float.round(Map.get(group, hd(keys)) - avg, 2)), f)
    end
    rec.(Map.keys(group), Map.new(), rec)
  end
end
