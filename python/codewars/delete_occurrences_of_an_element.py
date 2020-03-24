def delete_nth(order, max_e):
  count_dict = {n: 0 for n in set(order)}
  res = []
  for n in order:
    if count_dict[n] < max_e:
      res.append(n)
      count_dict[n] += 1
  return res
