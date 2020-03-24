from functools import reduce

def factorial(n):
  if n >= 0 and n <= 12:
    return reduce(lambda x, y: x * y, range(1, n + 1), 1)
  else:
    raise ValueError
