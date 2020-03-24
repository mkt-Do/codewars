import re

def increment_string(strng):
  m = re.search(r"(\d+)$", strng)
  return "{}{}".format(strng.split(m.group())[0], str(int(m.group()) + 1).zfill(len(m.group())))if m else "{}1".format(strng)

