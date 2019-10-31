defmodule StringClean do
  def string_clean(s) do
    String.split(s, "")
      |> Enum.filter(&(String.match?(&1, ~r/[^0-9]/)))
      |> Enum.join("")
  end
end
