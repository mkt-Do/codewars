import re

def abbreviate(s):
  words = [w for w in re.split('[^a-zA-Z]', s) if w != '']
  replaced = {w:w[0] + str(len(w[1:-1])) + w[-1] if len(w) > 3 else w for w in words}
  res = s
  for k, v in replaced.items():
    res = res.replace(k, v)
  return res
