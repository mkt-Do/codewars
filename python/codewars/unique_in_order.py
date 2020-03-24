def unique_in_order(iterable):
  res = []
  for i in iterable:
    if res:
      last = res.pop()
      if i == last:
        res.append(last)
      else:
        res.append(last)
        res.append(i)
    else:
      res.append(i)
  return res
