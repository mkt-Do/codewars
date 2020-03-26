def tower_builder(n_floors):
  return  [' ' * ((2 * n_floors - 1 - i) // 2) + '*' * i + ' ' * ((2 * n_floors - 1 - i) // 2) for i in range(1, 2 * n_floors + 1, 2)]
