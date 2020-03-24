from collections import deque

def sort_array(source_array):
  odd_queue = deque(sorted(filter(lambda n: n % 2 == 1, source_array)))
  res = []
  for elm in source_array:
    if elm % 2 == 1:
      res.append(odd_queue.popleft())
    else:
      res.append(elm)
  return res
