def title_case(title, minor_words=''):
  return ' '.join([s.capitalize() if s.lower() not in [w.lower() for w in minor_words.split(' ')] or i == 0 else s.lower() for i, s in enumerate(title.split(' '))])
