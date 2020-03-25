def diamond(n):
  if n <= 0 or n % 2 == 0:
    return None
  else:
    r = list(range(1, n + 1, 2))
    ls = r + list(reversed(r[:-1]))
    max_len = r[-1]
    res = ''
    for i in ls:
      res += ('*' * i).rjust((max_len - i) // 2 + i) + '\n'
    return res
