from collections import Counter

def stray(arr):
  return list(filter(lambda t: t[1] == 1, Counter(arr).items())).pop()[0]
