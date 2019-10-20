package codewars

// ns : slice of indices
// xs, ys : chromosomes as slices of ints
func Crossover(ns []int, xs []int, ys []int) ([]int, []int) {
	tgl := false
	newxs := []int{}
	newys := []int{}
	for i := 0; i < len(xs); i++ {
		x := xs[i]
		y := ys[i]
		if Contains(i, ns) {
			tgl = !tgl
		}
		if tgl {
			newxs = append(newxs, y)
			newys = append(newys, x)
		} else {
			newxs = append(newxs, x)
			newys = append(newys, y)
		}
	}
	return newxs, newys
}

func Contains(n int, arr []int) bool {
	for _, v := range arr {
		if v == n {
			return true
		}
	}
	return false
}
