def what_is_the_time(time_in_mirror):
  [h, m] = [int(s) for s in time_in_mirror.split(':')]
  mh = 12 if (h == 12 and m == 0) or (h == 11 and m != 0) else 11 if h == 12 else 12 - h if m == 0 else 11 - h
  mm = 0 if m == 0 else 60 - m
  return '{:02}:{:02}'.format(mh, mm)
  
