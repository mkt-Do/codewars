def show_sequence(n):
  return '{} = {}'.format('+'.join([str(i) for i in range(0, n + 1)]), sum(range(0, n + 1))) if n > 0 else '{}<0'.format(n) if n < 0 else '0=0'
