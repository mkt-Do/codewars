def fake_bin(x):
  return ''.join(['0' if int(d) < 5 else '1' for d in x])
