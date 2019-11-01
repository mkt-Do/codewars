defmodule ReducingBySteps do

  def som(a, b), do: a + b
  def mini(a, b), do: min(a, b)
  def maxi(a, b), do: max(a, b)
  def gcdi(a, b) do
    at = abs(a)
    bt = abs(b)
    case rem(at, bt) do
      0 -> bt
      n -> gcdi(b, n)
    end
  end
  def lcmu(a,b) do
    at = abs(a)
    bt = abs(b)
    g = gcdi(at, bt)
    div(at * bt, g)
  end
  
  def oper_array(fct, arr, init) do
    rec = fn
      [], res, _ -> res
      [head | tail], [], f -> f.(tail, [fct.(init, head)], f)
      [head | tail], res, f -> f.(tail, res ++ [fct.(hd(Enum.reverse(res)), head)], f)
    end
    rec.(arr, [], rec)
  end
end
