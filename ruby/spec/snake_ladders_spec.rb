require "spec_helper"

RSpec.describe SnakesLadders do
  it "play snake and ladders" do
    game = SnakesLadders.new
    expect(game.play(1, 1)).to eq "Player 1 is on square 38"#, "Should return: 'Player 1 is on square 38'"
    expect(game.play(1, 5)).to eq "Player 1 is on square 44"#, "Should return: 'Player 1 is on square 44'"
    expect(game.play(6, 2)).to eq "Player 2 is on square 31"#, "Should return: 'Player 2 is on square 31'"
    expect(game.play(1, 1)).to eq "Player 1 is on square 25"#, "Should return: 'Player 1 is on square 25'"
  end
end
