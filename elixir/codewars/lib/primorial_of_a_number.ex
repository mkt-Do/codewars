defmodule PrimorialOfANumber do
  def num_primorial(n) do
    Stream.iterate(2, &(&1 + 1))
      |> Stream.filter(&(is_prime(trunc(:math.sqrt(&1)), &1)))
      |> Enum.take(n)
      |> Enum.reduce(1, &(&1 * &2))
  end
  defp is_prime(_, 1), do: false
  defp is_prime(_, 2), do: true
  defp is_prime(1, _), do: true
  defp is_prime(i, n), do: if rem(n, i) == 0, do: false, else: is_prime(i - 1, n)
end
