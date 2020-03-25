import re

def count_deaf_rats(town):
  [left_rats, right_rats] = [re.split('(..)', pos)[1::2] for pos in town.replace(' ', '').split('P')]
  return left_rats.count('O~') + right_rats.count('~O')
