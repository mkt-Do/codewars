def iq_test(numbers):
  nums = [int(s) for s in numbers.split(' ')]
  (even, odd) = (list(filter(lambda n: n % 2 == 0, nums)), list(filter(lambda n: n % 2 == 1, nums)))
  if len(even) == 1:
    return nums.index(even[0]) + 1
  else:
    return nums.index(odd[0]) + 1
