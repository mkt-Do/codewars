def square_digits(num):
  return int(''.join([str(int(s)**2) for s in str(num)]))
