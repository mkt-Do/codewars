package codewars

func HighestRank(nums []int) int {
	dists := Distinct(nums)
	max := 0
	maxElm := 0
	for _, elm := range dists {
		cnt := Count(nums, elm)
		if cnt > max {
			max = cnt
			maxElm = elm
		} else if cnt == max && elm > maxElm {
			maxElm = elm
		}
	}
	return maxElm
}

func Distinct(arr []int) []int {
	m := map[int]int{}
	for _, e := range arr {
		m[e] = e
	}
	res := []int{}
	for k, _ := range m {
		res = append(res, k)
	}
	return res
}

func Count(arr []int, n int) int {
	cnt := 0
	for _, e := range arr {
		if e == n {
			cnt++
		}
	}
	return cnt
}
