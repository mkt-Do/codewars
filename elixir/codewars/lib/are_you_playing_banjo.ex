defmodule AreYouPlayingBanjo do
  def are_you_playing_banjo?(name) do
    case name do
      "R" <> _ -> name <> " plays banjo"
      "r" <> _ -> name <> " plays banjo"
      _ -> name <> " does not play banjo"
    end
  end
end
