defmodule ImplementSyntaxHighlighting do
  def highlight(code) do
    String.split(code, "")
      |> Enum.filter(&(&1 != ""))
      |> split_by_group([])
      |> Enum.map(&(Enum.reverse(&1)))
      |> Enum.reverse
      |> Enum.map(&(wrap_highlight(&1)))
      |> Enum.join("")
  end
  defp wrap_highlight(ar) do
    cond do
      hd(ar) == "F" -> "<span style=\"color: pink\">" <> Enum.join(ar, "") <> "</span>"
      hd(ar) == "L" -> "<span style=\"color: red\">" <> Enum.join(ar, "") <> "</span>"
      hd(ar) == "R" -> "<span style=\"color: green\">" <> Enum.join(ar, "") <> "</span>"
      String.match?(hd(ar), ~r/\d/) -> "<span style=\"color: orange\">" <> Enum.join(ar, "") <> "</span>"
      true -> Enum.join(ar, "")
    end
  end
  defp split_by_group([], res), do: res
  defp split_by_group([h | t], []), do: split_by_group(t, [[h]])
  defp split_by_group([h | t], [rh | rt]) do
    cond do
      hd(rh) == h -> split_by_group(t, [[h] ++ rh] ++ rt)
      String.match?(hd(rh), ~r/\d/) && String.match?(h, ~r/\d/) -> split_by_group(t, [[h] ++ rh] ++ rt)
      true -> split_by_group(t, [[h]] ++ [rh] ++ rt)
    end
  end
end
