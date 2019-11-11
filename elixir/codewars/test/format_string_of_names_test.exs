defmodule FormatStringOfNamesTest do
  use ExUnit.Case
  import FormatStringOfNames, only: [list: 1]

  test "basic tests" do
    assert list([%{name: "Bart"},%{name: "Lisa"},%{name: "Maggie"},%{name: "Homer"},%{name: "Marge"}]) == "Bart, Lisa, Maggie, Homer & Marge"
    assert list([%{name: "Bart"},%{name: "Lisa"},%{name: "Maggie"}]) == "Bart, Lisa & Maggie"
    assert list([%{name: "Bart"},%{name: "Lisa"}]) == "Bart & Lisa"
    assert list([%{name: "Bart"}]) == "Bart"
    assert list([]) == ""
  end
end
