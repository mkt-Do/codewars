def sum_dig_pow(a, b):
  return [v for _, v in list(filter(lambda e: range(a, b + 1)[e[0]] == e[1], enumerate([sum([int(d) ** (i + 1) for i, d in enumerate(list(str(n)))]) for n in range(a, b + 1)])))]
