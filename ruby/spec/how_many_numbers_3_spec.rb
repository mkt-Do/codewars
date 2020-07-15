require "spec_helper"

RSpec.describe HowManyNumbers3 do
  it "how many numbers 3" do
    expect(HowManyNumbers3.new.find_all(10, 3)).to eq [8, 118, 334]
    expect(HowManyNumbers3.new.find_all(27, 3)).to eq [1, 999, 999]
    expect(HowManyNumbers3.new.find_all(84, 4)).to eq []
    expect(HowManyNumbers3.new.find_all(35, 6)).to eq [123, 116999, 566666]
  end
end
