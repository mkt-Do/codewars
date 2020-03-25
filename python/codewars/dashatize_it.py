def dashatize(num):
  return ''.join(['-{}-'.format(s) if int(s) % 2 == 1 else s for s in list(str(abs(num)))]).strip('-').replace('--', '-') if num is not None else 'None'
