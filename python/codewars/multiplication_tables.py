def multiplication_table(row, col):
    return [[c * r for c in range(1, col + 1)] for r in range(1, row + 1)]
