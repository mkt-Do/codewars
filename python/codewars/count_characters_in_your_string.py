def count(string):
  return {c: list(string).count(c) for c in set(list(string))}
