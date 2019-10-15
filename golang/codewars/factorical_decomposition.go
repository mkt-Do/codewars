package codewars

import (
	"sort"
	"strconv"
)

func Decomp(n int) string {
	arr := []int{}
	for i := 2; i <= n; i++ {
		arr = append(arr, PrimeFactorization(i)...)
	}
	m := CountElms(arr)
	distincts := Distinct(arr)
	res := ""
	for i, e := range distincts {
		if i == 0 {
			if m[e] == 1 {
				res += strconv.Itoa(e)
			} else {
				res += strconv.Itoa(e) + "^" + strconv.Itoa(m[e])
			}
		} else {
			if m[e] == 1 {
				res += " * " + strconv.Itoa(e)
			} else {
				res += " * " + strconv.Itoa(e) + "^" + strconv.Itoa(m[e])
			}
		}
	}
	return res
}

func PrimeFactorization(n int) []int {
	tmp := n
	res := []int{}
	for {
		if tmp == 1 {
			break
		} else {
			for i := 2; i <= tmp; i++ {
				if tmp%i == 0 {
					res = append(res, i)
					tmp = tmp / i
					break
				}
			}
		}
	}
	return res
}

func CountElms(arr []int) map[int]int {
	m := map[int]int{}
	for _, e := range arr {
		if cnt, ok := m[e]; ok {
			m[e] = cnt + 1
		} else {
			m[e] = 1
		}
	}
	return m
}

func Distinct(arr []int) []int {
	m := map[int]int{}
	for _, e := range arr {
		m[e] = 1
	}
	res := []int{}
	for k, _ := range m {
		res = append(res, k)
	}
	sort.Ints(res)
	return res
}
