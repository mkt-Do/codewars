defmodule MessiGoalsFunction do
  def goals(la_liga_goals, copa_del_rey_goals, champions_league_goals), do: la_liga_goals + copa_del_rey_goals + champions_league_goals
end
