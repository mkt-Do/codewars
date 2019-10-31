defmodule HowManyLightsabersDoYouOwnTest do
  use ExUnit.Case
  import HowManyLightsabersDoYouOwn, only: [how_many_lightsabers_do_you_own: 1]

  test "is 0 for other people" do
    assert how_many_lightsabers_do_you_own("Adam") == 0
  end
  test "is 18 for Zach" do
    assert how_many_lightsabers_do_you_own("Zach") == 18
  end
end
