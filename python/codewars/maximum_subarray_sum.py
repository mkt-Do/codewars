def max_sequence(arr):
  l = len(arr) + 1
  res = max([sum(arr[i:j]) for i in range(l) for j in range(i + 1, l)]) if arr else 0
  return res if res >= 0 else 0
