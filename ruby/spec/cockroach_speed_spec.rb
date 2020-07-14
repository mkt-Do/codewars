require "spec_helper"

RSpec.describe CockroachSpeed do
  it "calclate from km/h to cm/s" do
    expect(CockroachSpeed.new.cockroach_speed(1.08)).to eq 30
    expect(CockroachSpeed.new.cockroach_speed(1.09)).to eq 30
    expect(CockroachSpeed.new.cockroach_speed(0)).to eq 0
  end
end
