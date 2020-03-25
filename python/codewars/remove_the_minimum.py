def remove_smallest(numbers):
  return [v for i, v in enumerate(numbers) if i != numbers.index(min(numbers))]
