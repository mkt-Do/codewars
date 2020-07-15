require "spec_helper"

RSpec.describe AlternatingSplit do
  it "encrypt and decrypt" do
    expect(AlternatingSplit.new.encrypt("This is a test!", 0)).to eq "This is a test!"
    expect(AlternatingSplit.new.encrypt("This is a test!", 1)).to eq "hsi  etTi sats!"
    expect(AlternatingSplit.new.encrypt("This is a test!", 2)).to eq "s eT ashi tist!"
    expect(AlternatingSplit.new.encrypt("This is a test!", 3)).to eq " Tah itse sits!"
    expect(AlternatingSplit.new.encrypt("This is a test!", 4)).to eq "This is a test!"
    expect(AlternatingSplit.new.encrypt("This is a test!", -1)).to eq "This is a test!"
    expect(AlternatingSplit.new.encrypt("This kata is very interesting!", 1)).to eq "hskt svr neetn!Ti aai eyitrsig"
    expect(AlternatingSplit.new.decrypt("This is a test!", 0)).to eq "This is a test!"
    expect(AlternatingSplit.new.decrypt("hsi  etTi sats!", 1)).to eq "This is a test!"
    expect(AlternatingSplit.new.decrypt("s eT ashi tist!", 2)).to eq "This is a test!"
    expect(AlternatingSplit.new.decrypt(" Tah itse sits!", 3)).to eq "This is a test!"
    expect(AlternatingSplit.new.decrypt("This is a test!", 4)).to eq "This is a test!"
    expect(AlternatingSplit.new.decrypt("This is a test!", -1)).to eq "This is a test!"
    expect(AlternatingSplit.new.decrypt("hskt svr neetn!Ti aai eyitrsig", 1)).to eq "This kata is very interesting!"
    expect(AlternatingSplit.new.encrypt("", 0)).to eq ""
    expect(AlternatingSplit.new.decrypt("", 0)).to eq ""
  end
end
