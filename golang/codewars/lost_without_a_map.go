package codewars

func Maps(x []int) []int {
	res := []int{}
	for _, v := range x {
		res = append(res, v*2)
	}
	return res
}
