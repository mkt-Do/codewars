defmodule SplitTheBillTest do

  use ExUnit.Case

  def testing(numtest, group, ans) do 
    IO.puts("Test #{numtest}")
    assert SplitTheBill.split_the_bill(group) == ans
  end
  
  test "split_the_bill" do    
    testing(1, %{:A => 20, :B => 15, :C => 10}, %{:A => 5.00, :B => 0.00, :C => -5.00 })
    testing(2, %{:A => 40, :B => 25, :X => 10}, %{:A => 15.00, :B => 0.00, :X => -15.00})
    testing(3, %{:A => 40, :B => 25, :C => 10, :D => 153, :E => 58}, %{:A => -17.20, :B => -32.20, :C => -47.20, :D => 95.80, :E => 0.80})
    testing(4, %{:A => 475, :B => 384, :C => 223, :D => 111, :E => 19}, %{:A => 232.6, :B => 141.6, :C => -19.4, :D => -131.4, :E => -223.4})
    testing(5, %{:A => 20348, :B => 493045, :C => 2948, :D => 139847, :E => 48937534, :F => 1938724, :G => 4, :H => 2084}, %{:A => -6421468.75, :B => -5948771.75, :C => -6438868.75, :D => -6301969.75, :E => 42495717.25, :F => -4503092.75, :G => -6441812.75, :H => -6439732.75})
  end
end
