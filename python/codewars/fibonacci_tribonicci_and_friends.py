def Xbonacci(signature, n):
  l = len(signature)
  res = signature
  if l >= n:
    return res[0:n]
  range_pairs = [(i, i + l) for i in range(0, n - l)]
  for s, e in range_pairs:
    res.append(sum(res[s:e]))
  return res
