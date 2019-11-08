defmodule ConsecutiveKPrime do

  def consec_Kprimes(k, arr) do
    primes = arr |> Enum.map(&(prime_factorization(2, &1, [])))
    primes |> Enum.zip(tl(primes))
      |> Enum.filter(&(length(elem(&1, 0)) == length(elem(&1, 1)) && length(elem(&1, 0)) == k))
      |> length
  end
  defp prime_factorization(_, 1, res), do: res
  defp prime_factorization(i, n, res), do: if rem(n, i) == 0, do: prime_factorization(2, div(n, i), res ++ [i]), else: prime_factorization(i + 1, n, res)
end
