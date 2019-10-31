defmodule AreYouPlayingBanjoTest do
  use ExUnit.Case
  import AreYouPlayingBanjo, only: [are_you_playing_banjo?: 1]

  test "play and don't play banjo" do
    assert are_you_playing_banjo?("Martin") == "Martin does not play banjo"
    assert are_you_playing_banjo?("Rikke") == "Rikke plays banjo"
  end
end
