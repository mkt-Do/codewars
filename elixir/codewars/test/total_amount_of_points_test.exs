defmodule TotalAmountOfPointsTest do
  import TotalAmountOfPoints, only: [points: 1]
  use ExUnit.Case

  test "returns the correct points total" do
    total = points(["3:1", "2:1", "2:2", "3:3", "17:10", "40:45", "70:77", "0:0", "1:1"])
    assert total == 13
  end
  
  test "returns the correct points total for a randomized list" do
    [score_total, scores] = generate_random_score([], 0, 10)
    assert points(scores) == score_total
  end
  
  def random_num(), do: :rand.uniform(100)
  
  def generate_random_score(scores, score_total, 0), do: [score_total, scores]
  def generate_random_score(scores, score_total, n) do
    first = random_num()
    second = random_num()
    score_total =
      cond do 
        first > second ->
          score_total + 3
        first < second ->
          score_total
        first == second ->
          score_total + 1
      end
    
    scores ++ ["#{first}:#{second}"]
      |> generate_random_score(score_total, n-1)
  end
end
