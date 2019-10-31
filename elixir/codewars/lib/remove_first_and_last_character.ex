defmodule RemoveFirstAndLastCharacter do
  def remove_chars(s), do: String.slice(s, 1, String.length(s) - 2)
end
