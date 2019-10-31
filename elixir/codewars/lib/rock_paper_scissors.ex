defmodule RockPaperScissors do
  def rps(p1, p2) do
    case {p1, p2} do
      {_, _} when p1 == p2 -> "Draw!"
      {"rock", "scissors"} -> "Player 1 won!"
      {"rock", "paper"} -> "Player 2 won!"
      {"scissors", "rock"} -> "Player 2 won!"
      {"scissors", "paper"} -> "Player 1 won!"
      {"paper", "rock"} -> "Player 1 won!"
      {"paper", "scissors"} -> "Player 2 won!"
    end
  end
end
