defmodule SimpsonRule do
  def simpson(n) do
    f = fn x -> 3 * :math.pow(:math.sin(x), 3) / 2 end
    igl1 = 1..div(n, 2) |> Enum.reduce(0, fn(i, acc) -> acc + f.((2 * i - 1) * :math.pi / n) end)
    igl2 = 1..(div(n, 2) - 1) |> Enum.reduce(0, fn(i, acc) -> acc + f.(2 * i * :math.pi / n) end)
    :math.pi * (f.(:math.pi) + 4 * igl1 + 2 * igl2) / (3 * n)
  end
end
