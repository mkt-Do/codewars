def calculate_years(principal, interest, tax, desired):
  saving = principal
  years = 0
  while saving < desired:
    saving = saving * (1 + interest - interest * tax)
    years += 1
  return years
