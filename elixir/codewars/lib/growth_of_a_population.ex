defmodule GrowthOfAPopulation do
  def nb_year(p0, percent, aug, p) do
    rec(p0, percent, aug, p, 0)
  end
  def rec(base, percent, aug, limit, year) do
    if base >= limit do
      year
    else
      rec(base + trunc(base * percent / 100) + aug, percent, aug, limit, year + 1)
    end
  end
end
