class SnakesLadders
  def initialize()
    @players = {"Player 1" => 0, "Player 2" => 0}
    @player = "Player 1"
    @ladders = {2 => 38, 7 => 14, 8 => 31, 15 => 26, 21 => 42,
        28 => 84, 36 => 44, 51 => 67, 71 => 91, 78 => 98, 87 => 94}
    @snakes = {16 => 6, 46 => 25, 49 => 11, 62 => 19, 64 => 60,
        74 => 53, 89 => 68, 92 => 88, 95 => 75, 99 => 80}
  end

  def play(die1, die2)
    playing = @player
    if @players[playing] == 100
      "Game over!"
    else
        square = @players[playing] + (die1 + die2)
      if square > 100
        square = 100 - (square - 100)
      end
      if @ladders.key?(square)
        square = @ladders[square]
      elsif @snakes.key?(square)
        square = @snakes[square]
      end
      @players[playing] = square
      if die1 != die2
        if @player == "Player 1"
          @player = "Player 2"
        else
          @player = "Player 1"
        end
      end
      if square == 100
        "#{playing} Wins!"
      elsif @players.value?(100)
        "Game over!"
      else
        "#{playing} is on square #{square}"
      end
    end
  end
end
