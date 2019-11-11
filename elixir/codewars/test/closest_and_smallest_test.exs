defmodule ClosestAndSmallestTest do
  
  use ExUnit.Case

  defp dotest(numtest, s, sol) do 
    IO.puts("Test #{numtest}")
    assert ClosestAndSmallest.closest(s) == sol
  end
  
  test "closest" do    
    dotest(1, "", [{}, {}])
    dotest(2, "456899 50 11992 176 272293 163 389128 96 290193 85 52", [{13, 9, 85}, {14, 3, 176}])
    dotest(3, "239382 162 254765 182 485944 134 468751 62 49780 108 54", [{8, 5, 134}, {8, 7, 62}])
    dotest(4, "241259 154 155206 194 180502 147 300751 200 406683 37 57", [{10, 1, 154}, {10, 9, 37}])
    dotest(5, "89998 187 126159 175 338292 89 39962 145 394230 167 1", [{13, 3, 175}, {14, 9, 167}])
    dotest(6, "462835 148 467467 128 183193 139 220167 116 263183 41 52", [{13, 1, 148}, {13, 5, 139}])
  end
end
