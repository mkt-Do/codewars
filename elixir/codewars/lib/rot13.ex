defmodule Rot13 do
  def rot13(string) do
    string |> to_charlist |> Enum.map(fn c ->
      cond do
        ?A <= c && c <= ?M || ?a <= c && c <= ?m -> c + 13
        ?N <= c && c <= ?Z || ?n <= c && c <= ?z -> c - 13
        true -> c
      end
    end) |> to_string
  end
end
