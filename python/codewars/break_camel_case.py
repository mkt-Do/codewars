def solution(s):
  return ''.join([' ' + s if s.isupper() and i != 0 else s for i, s in enumerate(list(s))])
