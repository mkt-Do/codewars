def rolldice_sum_prob(sum_, dice_amount):
    dice = [(i,) for i in range(1, 7)]
    pattern = []
    for n in range(1, dice_amount + 1):
        if pattern == []:
            pattern = dice
        else:
            pattern = [(*i, *j) for j in pattern for i in dice]
    probs = [t for t in pattern if sum(t) == sum_]
    return len(probs) / len(pattern)
