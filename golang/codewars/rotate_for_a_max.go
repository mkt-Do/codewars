package codewars

import "strconv"

func MaxRot(n int64) int64 {
	nstr := strconv.FormatInt(n, 10)
	rots := []int64{}
	rots = append(rots, n)
	for i := 0; i < len(nstr); i++ {
		keep := nstr[:i]
		rotate := nstr[i : i+1]
		rest := nstr[i+1:]
		newNum, _ := strconv.ParseInt(keep+rest+rotate, 10, 64)
		rots = append(rots, newNum)
		nstr = keep + rest + rotate
	}
	return max(rots)
}

func max(arr []int64) int64 {
	n := arr[0]
	for i := 1; i < len(arr); i++ {
		if n < arr[i] {
			n = arr[i]
		}
	}
	return n
}
