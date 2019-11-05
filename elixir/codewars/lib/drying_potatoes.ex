defmodule DryingPotatoes do

    @spec potatoes(integer, integer, integer) :: integer
    def potatoes(p0, w0, p1), do: trunc(w0 * (100 - p0) / (100 - p1))
    
end
