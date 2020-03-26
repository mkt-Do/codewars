def prefill(n, v=None):
  if str(n).isdigit() and int(n) >= 0:
    return [v for _ in range(0, int(n))]
  elif v is None:
    return None
  else:
    raise TypeError('{} is invalid'.format(n))
