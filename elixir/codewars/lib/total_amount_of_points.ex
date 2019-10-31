defmodule TotalAmountOfPoints do
  def points(games) do
    games
      |> Enum.map(&(String.split(&1, ":")))
      |> Enum.map(&([String.to_integer(Enum.at(&1, 0)), String.to_integer(Enum.at(&1, 1))]))
      |> Enum.map(&(case &1 do
        [x, y] when x > y -> 3
        [x, y] when x == y -> 1
        [x, y] when x < y -> 0
      end))
      |> Enum.sum
  end
end
