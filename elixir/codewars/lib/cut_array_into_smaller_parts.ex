defmodule CutArrayIntoSmallerParts do
  def make_parts(lst, n) do
    res = 0..(div(length(lst) - 1, n))
      |> Enum.map(fn i -> Enum.slice(lst, i * n, n) end)
    if Enum.at(res, 0) == [] do
      List.flatten(res)
     else
       res
     end
  end
end
