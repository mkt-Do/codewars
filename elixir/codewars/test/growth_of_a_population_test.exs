defmodule GrowthOfAPopulationTest do
  use ExUnit.Case

  import GrowthOfAPopulation, only: [nb_year: 4]
  test "nb_year" do
    assert nb_year(1500, 5, 100, 5000) == 15
    assert nb_year(1500000, 2.5, 10000, 2000000) == 10
    assert nb_year(1500000, 0.25, 1000, 2000000) == 94
  end
end
