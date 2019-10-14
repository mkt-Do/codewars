package codewars

import "strconv"

func Smallest(n int64) []int64 {
	nstr := strconv.FormatInt(n, 10)
	takeIdx, insIdx := 0, 0
	min := n
	for i := 0; i < len(nstr); i++ {
		digit := nstr[i : i+1]
		rest := nstr[:i] + nstr[i+1:]
		for j := 0; j < len(nstr); j++ {
			newstr := rest[:j] + digit + rest[j:]
			newstrn, _ := strconv.ParseInt(newstr, 10, 64)
			if min > newstrn {
				takeIdx = i
				insIdx = j
				min = newstrn
			}
		}
	}
	res := []int64{}
	res = append(res, min)
	res = append(res, int64(takeIdx))
	res = append(res, int64(insIdx))
	return res
}
