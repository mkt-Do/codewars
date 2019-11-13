defmodule DeodrantEvaporator do
  
  @spec evaporator(number, number, number) :: number 
  def evaporator(content, evap_per_day, threshold), do: evaporator(content, evap_per_day, content * threshold / 100, 0)
  def evaporator(content, evap_per_day, threshold, day) when content < threshold, do: day
  def evaporator(content, evap_per_day, threshold, day), do: evaporator(content * (100 - evap_per_day) / 100, evap_per_day, threshold, day + 1)
end

