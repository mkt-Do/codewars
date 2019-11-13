defmodule PrimesInNumbers do

  def prime_factors(n) do
    prime_map = primes(n)
    Map.keys(prime_map)
      |> Enum.reduce("", fn k, str -> str <> "(" <> Integer.to_string(k) <> "**" <> Integer.to_string(Map.get(prime_map, k)) <> ")" end)
      |> String.replace("**1", "")
  end
  def primes(n), do: primes(n, 2, %{})
  def primes(1, _, res), do: res
  def primes(n, i, res) do
    if rem(n, i) == 0 do
      primes(div(n, i), 2, Map.merge(res, %{i => 1}, fn _, v1, v2 -> v1 + v2 end))
    else
      primes(n, i + 1, res)
    end
  end
end
